package org.example.Model;

import org.example.Enum.StatusOperacional;

public class Maquina {

    private int id;
    private String nome;
    private String setor;
    private StatusOperacional status;


    public Maquina(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
        this.status = StatusOperacional.valueOf("OPERACIONAL");
    }

    public Maquina(int id, String nome, String setor, StatusOperacional status) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.status = status;
    }

    public Maquina(int id, String nome, String setor, String status) {
    }

    public StatusOperacional setStatus() {
        this.status = status;
        return null;
    }

    public StatusOperacional getStatus() {
        return status;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}