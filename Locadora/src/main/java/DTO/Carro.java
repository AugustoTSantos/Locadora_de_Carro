package DTO;

public class Carro {
    private String placa;
    private String marca;
    private String valorAluguel;
    private String disponivelAtualmente;


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

    public String getDisponivelAtualmente() {
        return disponivelAtualmente;
    }
    public void setDisponivelAtualmente(String disponivelAtualmente) {
        this.disponivelAtualmente = disponivelAtualmente;
    }
}
