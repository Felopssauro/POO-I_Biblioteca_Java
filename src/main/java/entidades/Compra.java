/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author felops
 */
public class Compra {
    private int ID;
    private int ID_cliente;
    private int ISBN_livro;
    private String date; // qual seria a melhor forma de armazenar date? 

    public Compra(int ID, int ID_cliente, int ISBN_livro, String date) {
        this.ID = ID;
        this.ID_cliente = ID_cliente;
        this.ISBN_livro = ISBN_livro;
        this.date = date;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public int getISBN_livro() {
        return ISBN_livro;
    }

    public void setISBN_livro(int ISBN_livro) {
        this.ISBN_livro = ISBN_livro;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
