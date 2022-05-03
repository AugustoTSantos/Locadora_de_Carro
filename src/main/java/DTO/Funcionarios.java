package DTO;

public class Funcionarios {
    public String nomeFuncionario;
    public String salario;
    public String numero;
    
    public Funcionarios(String nomeFuncionario, String salario, String numero) {
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
        this.numero = numero;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
