/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author felops
 */
public class Cliente {
    private int ID;
    //private enum(tipo_pessoa) tipo;
    private String CPF_CNPJ;
    private String nome;
    private String endereco;
    private String livros_comprados;

    public Cliente(int ID, String CPF_CNPJ, String nome, String endereco, String livros_comprados) {
        this.ID = ID;
        this.CPF_CNPJ = CPF_CNPJ;
        this.nome = nome;
        this.endereco = endereco;
        this.livros_comprados = livros_comprados;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLivros_comprados() {
        return livros_comprados;
    }

    public void setLivros_comprados(String livros_comprados) {
        this.livros_comprados = livros_comprados;
    }
    
}
