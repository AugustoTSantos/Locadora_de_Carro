package DTO;

public class Funcionario {
    private String nomeFuncionario;
    private float salario;
    private String funcao;

    
    public Funcionario(String nomeFuncionario, float salario, String funcao) {
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
        this.funcao = funcao;
    }


    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
