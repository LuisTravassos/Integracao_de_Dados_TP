package com.mycompany.id_tp;

public class Autor {
    
    private static int id = 0;
    private String nome, dataNasc, dataMort, nacional, fotografia, generoLiter, ocupacoes;

    public Autor(String nome, String dataNasc, String dataMort, String nacional, String fotografia, String generoLiter, String ocupacoes) {
        this.id += 1;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.dataMort = dataMort;
        this.nacional = nacional;
        this.fotografia = fotografia;
        this.generoLiter = generoLiter;
        this.ocupacoes = ocupacoes;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getDataMort() {
        return dataMort;
    }

    public void setDataMort(String dataMort) {
        this.dataMort = dataMort;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getGeneroLiter() {
        return generoLiter;
    }

    public void setGeneroLiter(String generoLiter) {
        this.generoLiter = generoLiter;
    }

    public String getOcupacoes() {
        return ocupacoes;
    }

    public void setOcupacoes(String ocupacoes) {
        this.ocupacoes = ocupacoes;
    }
}
