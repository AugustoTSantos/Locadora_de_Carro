package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Carro;



public class DaoCarro {
    private String carroInsert = "INSERT INTO carro (car_placa, car_marca, car_valor_aluguel," +
    "car_disponivel_atualmente) VALUES (?, ?, ?, ?)";

    public void cadastrar(Carro carro) {

        String sql = carroInsert;

        try(Connection conn = new Conexao().conectar(); PreparedStatement stm = conn.prepareStatement(sql);){
            //PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, carro.getPlaca());
            stm.setString(2, carro.getMarca());
            stm.setString(3, carro.getValorAluguel());
            stm.setString(4, carro.getDisponivelAtualmente());

            stm.execute();
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
