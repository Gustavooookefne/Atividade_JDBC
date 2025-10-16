package org.example.Model;

import org.example.Enum.StatusOrdemManutencao;

import java.time.LocalDateTime;

public class OrdemManutencao {

    private int id;
    Maquina maquina ;
    Tecnico tecnico;
    private LocalDateTime dataSolicitacao;
    private StatusOrdemManutencao status;

    public OrdemManutencao(int id, Maquina maquina, Tecnico tecnico, StatusOrdemManutencao status) {
        this.id = id;
        this.maquina = maquina;
        this.tecnico = tecnico;
        this.dataSolicitacao = LocalDateTime.now();
        this.status = status;
    }


    public OrdemManutencao(Maquina maquina ,Tecnico tecnico ,StatusOrdemManutencao status){
        this.maquina = maquina;
        this.tecnico = tecnico;
        this.dataSolicitacao = LocalDateTime.now();
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(StatusOrdemManutencao status) {
        this.status = status;
    }

    public int getIdMaquina() {
        return 0;
    }

    public int getIdTecnico() {
        return 0;
    }
}
