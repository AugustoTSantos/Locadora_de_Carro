package DTO;

public class Cliente {
    private String nomeCliente;
    private int numeroNegociacoes;
    private String comCarroAtualmente;

    
    public Cliente(String nomeCliente, int numeroNegociacoes, String comCarroAtualmente) {
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

    public int getNumeroNegociacoes() {
        return numeroNegociacoes;
    }
    public void setNumeroNegociacoes(int numeroNegociacoes) {
        this.numeroNegociacoes = numeroNegociacoes;
    }

    public String getComCarroAtualmente() {
        return comCarroAtualmente;
    }
    public void setComCarroAtualmente(String comCarroAtualmente) {
        this.comCarroAtualmente = comCarroAtualmente;
    }
}
