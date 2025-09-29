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
    private String tipo;
    private String CPF_CNPJ;
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(int ID, String tipo, String CPF_CNPJ, String nome, String endereco, String telefone) {
        this.ID = ID;
        this.tipo = tipo; 
        this.CPF_CNPJ = CPF_CNPJ;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    public String getTelefone() { 
        return telefone;
    }

    public void setTelefone(String telefone) { 
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return this.getNome();
    }
}
