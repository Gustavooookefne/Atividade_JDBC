package org.example.Model;

public class Peca {

    private int id;
    private String nome;
    private String estoque;

    public Peca(int id ,String nome ,String estoque){
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
    }

    public Peca(String nome ,String estoque){
        this.nome = nome;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }
}
