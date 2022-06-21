package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Funcionario;

public class DaoFuncionario {
    private String funcionarioInsert = "INSERT INTO funcionario (fun_nome, fun_salario, fun_funcao)" + 
    "VALUES (?, ?, ?)";

    public void cadastrar(Funcionario funcionario) {

        String sql = funcionarioInsert;

        try(Connection conn = new Conexao().conectar(); PreparedStatement stm = conn.prepareStatement(sql);){
            //PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, funcionario.getNomeFuncionario());
            stm.setString(2, funcionario.getSalario());
            stm.setString(3, funcionario.getFuncao());

            stm.execute();
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
