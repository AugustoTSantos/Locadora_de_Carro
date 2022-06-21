package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Cliente;

public class DaoCliente {
    private String carroInsert = "INSERT INTO cliente (cli_nome, cli_numero_negociacoes," +
    "cli_com_carro_atualmente) VALUES (?, ?, ?)";

    public void cadastrar(Cliente cliente) {

        String sql = carroInsert;

        try(Connection conn = new Conexao().conectar(); PreparedStatement stm = conn.prepareStatement(sql);){
            //PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, cliente.getNomeCliente());
            stm.setString(2, cliente.getNumeroNegociacoes());
            stm.setString(3, cliente.getNumeroNegociacoes());

            stm.execute();
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
