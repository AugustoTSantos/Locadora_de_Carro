package DTO;

public class Cliente {
    private String nomeCliente;
    private String numeroNegociacoes;
    private String comCarroAtualmente;


    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroNegociacoes() {
        return numeroNegociacoes;
    }
    public void setNumeroNegociacoes(String numeroNegociacoes) {
        this.numeroNegociacoes = numeroNegociacoes;
    }

    public String getComCarroAtualmente() {
        return comCarroAtualmente;
    }
    public void setComCarroAtualmente(String comCarroAtualmente) {
        this.comCarroAtualmente = comCarroAtualmente;
    }
}
