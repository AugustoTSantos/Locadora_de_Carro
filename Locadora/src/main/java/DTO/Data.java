package DTO;

import java.util.Date;

public class Data {
    private Date dataNegociacao;
    private Date dataEntrega;

    
    public Data(Date dataNegociacao, Date dataEntrega) {
        this.dataNegociacao = dataNegociacao;
        this.dataEntrega = dataEntrega;
    }


    public Date getDataNegociacao() {
        return dataNegociacao;
    }
    public void setDataNegociacao(Date dataNegociacao) {
        this.dataNegociacao = dataNegociacao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
