package DTO;

public class Clientes {
    public String nomeCliente;
    public String numeroNegociacoes;
    public String comCarroAtualmente;
    
    public Clientes(String nomeCliente, String numeroNegociacoes, String comCarroAtualmente) {
        this.nomeCliente = nomeCliente;
        this.numeroNegociacoes = numeroNegociacoes;
        this.comCarroAtualmente = comCarroAtualmente;
    }

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
