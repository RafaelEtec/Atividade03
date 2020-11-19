package com.example.atividade03;

public class Religions {

    private String adeptos;
    private String descricao;
    private String titulo;
    private int miniatura;

    public Religions() {
    }

    public Religions(String adeptos, String titulo, String descricao, int miniatura) {
        this.adeptos = adeptos;
        this.titulo = titulo;
        this.descricao = descricao;
        this.miniatura = miniatura;
    }

    public String getAdeptos() {
        return adeptos;
    }

    public void setAdeptos(String adeptos) {
        this.adeptos = adeptos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}
