/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author felops
 */

public class Livro {
    private String isbn; 
    private String titulo; 
    private String autor;
    private String assunto;
    private Editora editora; 
    private int quantidadeEmEstoque;

    public Livro(String isbn, String titulo, String autor, String assunto, Editora editora, int quantidadeEmEstoque) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.assunto = assunto;
        this.editora = editora;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
    
}
