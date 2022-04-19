public class Carros {
    private String placa;
    private String marca;
    private double valorAluguel;
    private boolean cambioAutomatico;
    
    public Carros(String placa, String marca, double valorAluguel, boolean cambioAutomatico) {
        this.placa = placa;
        this.marca = marca;
        this.valorAluguel = valorAluguel;
        this.cambioAutomatico = cambioAutomatico;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }
    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }
}
