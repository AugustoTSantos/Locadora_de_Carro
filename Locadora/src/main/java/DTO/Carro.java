package DTO;

public class Carro {
    private String placa;
    private String marca;
    private float valorAluguel;
    private String disponivelAtualmente;

    
    public Carro(String placa, String marca, float valorAluguel, String disponivelAtualmente) {
        this.placa = placa;
        this.marca = marca;
        this.valorAluguel = valorAluguel;
        this.disponivelAtualmente = disponivelAtualmente;
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

    public float getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getDisponivelAtualmente() {
        return disponivelAtualmente;
    }
    public void setDisponivelAtualmente(String disponivelAtualmente) {
        this.disponivelAtualmente = disponivelAtualmente;
    }
}
