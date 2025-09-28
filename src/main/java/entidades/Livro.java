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
    private int ISBN;
    private int ID_editora;
    private String autor;
    private String assunto;
    private int qntde_livro;

    public Livro(int ISBN, int ID_editora, String autor, String assunto, int qntde_livro) {
        this.ISBN = ISBN;
        this.ID_editora = ID_editora;
        this.autor = autor;
        this.assunto = assunto;
        this.qntde_livro = qntde_livro;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getID_editora() {
        return ID_editora;
    }

    public void setID_editora(int ID_editora) {
        this.ID_editora = ID_editora;
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

    public int getQntde_livro() {
        return qntde_livro;
    }

    public void setQntde_livro(int qntde_livro) {
        this.qntde_livro = qntde_livro;
    }
    
    
}
