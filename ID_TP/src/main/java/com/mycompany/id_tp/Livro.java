package com.mycompany.id_tp;

public class Livro {
    
    private int idAutor;
    private String isbn, nomeAutor, titulo, editora, preco, fotoCapa;

    public Livro(int idAutor, String isbn, String nomeAutor, String titulo, String editora, String preco, String fotoCapa) {
        this.idAutor = idAutor;
        this.isbn = isbn;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.editora = editora;
        this.preco = preco;
        this.fotoCapa = fotoCapa;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getFotoCapa() {
        return fotoCapa;
    }

    public void setFotoCapa(String fotoCapa) {
        this.fotoCapa = fotoCapa;
    }
}
