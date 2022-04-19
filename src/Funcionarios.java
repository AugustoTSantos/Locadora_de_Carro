public class Funcionarios {
    private String nomeFuncionario;
    private double salario;
    private int numero;
    
    public Funcionarios(String nomeFuncionario, double salario, int numero) {
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

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
