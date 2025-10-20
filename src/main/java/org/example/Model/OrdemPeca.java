package org.example.Model;

import org.example.Enum.StatusOrdemManutencao;

public class OrdemPeca {
    private int id;
    private int idOrdem;
    private int idPeca;
    private int quanidade;
    StatusOrdemManutencao status;

    public OrdemPeca(int id , int idOrdem , int idPeca , int quantidade , StatusOrdemManutencao status){
        this.id = id;
        this.idOrdem = idOrdem;
        this.idPeca = idPeca;
        this.quanidade = quantidade;
    }

    public OrdemPeca(int idOrdem ,int idPeca ,int quanidade ,StatusOrdemManutencao status){
        this.idOrdem = idOrdem;
        this.idPeca = idPeca;
        this.quanidade = quanidade;
    }

    public OrdemPeca(int idOrdem, int idPeca, int quantidade, int status) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOrdem() {
        return idOrdem;
    }

    public void setIdOrdem(int idOrdem) {
        this.idOrdem = idOrdem;
    }

    public int getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(int idPeca) {
        this.idPeca = idPeca;
    }

    public int getQuanidade() {
        return quanidade;
    }

    public void setQuanidade(int quanidade) {
        this.quanidade = quanidade;
    }

    public StatusOrdemManutencao getStatus() {
        return status;
    }

    public void setStatus(StatusOrdemManutencao status) {
        this.status = status;
    }

    public boolean getDetalhesConfirmacao() {
        return false;
    }
}
