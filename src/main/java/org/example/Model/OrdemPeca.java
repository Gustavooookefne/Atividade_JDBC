package org.example.Model;

public class OrdemPeca {
    private int id;
    OrdemPeca ordemPeca;
    Peca peca;
    private int quanidade;

    public OrdemPeca(int id ,OrdemPeca ordemPeca ,Peca peca ,int quanidade){
        this.id = id;
        this.ordemPeca = ordemPeca;
        this.peca = peca;
        this.quanidade = quanidade;
    }

    public OrdemPeca(OrdemPeca ordemPeca ,Peca peca ,int quanidade){
        this.ordemPeca = ordemPeca;
        this.peca = peca;
        this.quanidade = quanidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrdemPeca getOrdemPeca() {
        return ordemPeca;
    }

    public void setOrdemPeca(OrdemPeca ordemPeca) {
        this.ordemPeca = ordemPeca;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public int getQuanidade() {
        return quanidade;
    }

    public void setQuanidade(int quanidade) {
        this.quanidade = quanidade;
    }
}
