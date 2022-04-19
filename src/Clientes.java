public class Clientes {
    private String nomeCliente;
    private int numeroNegociacoes;
    private boolean comCarroAtualmente;
    
    public Clientes(String nomeCliente, int numeroNegociacoes, boolean comCarroAtualmente) {
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

    public boolean isComCarroAtualmente() {
        return comCarroAtualmente;
    }
    public void setComCarroAtualmente(boolean comCarroAtualmente) {
        this.comCarroAtualmente = comCarroAtualmente;
    }
}
