package DAO;

import DTO.Aluguel;

import java.sql.*;

public class DaoAluguel {

	private String aluguelInsert = "INSERT INTO aluguel (alu_data_devolucao, alu_data_aluguel) VALUES (?, ?)";


    public void cadastrar(Aluguel data) {

        String sql = aluguelInsert;

        try(Connection conn = new Conexao().conectar(); PreparedStatement stm = conn.prepareStatement(sql);){
            //PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, data.getDataNegociacao());
            stm.setString(2, data.getDataEntrega());

            stm.execute();
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
