package com.mycompany.id_tp;

import java.util.List;

public class Autor {
    
    private int id;
    private String nome, dataNasc, dataMort, nacional, fotografia;
    private List<String> generoLiter, ocupacoes, premios;

    public Autor(int id, String nome, String dataNasc, String dataMort, String nacional, String fotografia, List<String> generoLiter, List<String> ocupacoes, List<String> premios) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.dataMort = dataMort;
        this.nacional = nacional;
        this.fotografia = fotografia;
        this.generoLiter = generoLiter;
        this.ocupacoes = ocupacoes;
        this.premios = premios;
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

    public List<String> getGeneroLiter() {
        return generoLiter;
    }

    public void setGeneroLiter(List<String> generoLiter) {
        this.generoLiter = generoLiter;
    }

    public List<String> getOcupacoes() {
        return ocupacoes;
    }

    public void setOcupacoes(List<String> ocupacoes) {
        this.ocupacoes = ocupacoes;
    }

    public List<String> getPremios() {
        return premios;
    }

    public void setPremios(List<String> premios) {
        this.premios = premios;
    }
}
