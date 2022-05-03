package DTO;

public class Carros {
    public String placa;
    public String marca;
    public String valorAluguel;
    public String cambioAutomatico;
    
    public Carros(String placa, String marca, String valorAluguel, String cambioAutomatico) {
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

    public String getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(String valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getCambioAutomatico() {
        return cambioAutomatico;
    }
    public void setCambioAutomatico(String cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }
}
