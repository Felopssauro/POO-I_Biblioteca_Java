/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uepa.biblioteca.java;

import controles.ClienteControle;
import controles.EditoraControle;
import controles.LivroControle;
import entidades.Cliente;
import entidades.Editora;
import entidades.Livro;
import telas.MenuInicial; 

public class BibliotecaJava {

    public static void main(String[] args) {
        popularBancoDeDados();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }
    
    public static void popularBancoDeDados() {
        ClienteControle clienteControle = new ClienteControle();
        EditoraControle editoraControle = new EditoraControle();
        LivroControle livroControle = new LivroControle();

        if (editoraControle.listarTodas().isEmpty()) {

            // Adicionar Editoras
            editoraControle.adicionarEditora("DSPD", "Rua da Programaçao, 123", "111-1111", "Thiago Conte");
            editoraControle.adicionarEditora("UEPA", "Alameda Linux", "222-2222", "Italo Di Paolo");

            // Adicionar Clientes
            clienteControle.adicionarCliente("Ananda Vitória", "Cidade Nova", "221.111.444-22", "91 98888-7777", "Fisica");
            clienteControle.adicionarCliente("Driele Carvalho", "Icui", "222.111.444-22", "91 97777-6666", "Fisica");
            clienteControle.adicionarCliente("Thaylan Fonseca", "Icui", "223.111.444-22", "91 98886-6426", "Fisica");
            clienteControle.adicionarCliente("Filipe Cruz", "Una", "224.111.444-22", "91 9712-6323", "Fisica");

            // Adicionar Livros
            Editora DSPD = editoraControle.buscarPorNome("DSPD").get();
            Editora UEPA = editoraControle.buscarPorNome("UEPA").get();
            
            Livro livro1 = new Livro("123123123", "Codigo Limpo", "Fulano de tal", "Programas", DSPD, 15);
            Livro livro2 = new Livro("123456789", "O Programador Pragmatico", "Ciclano de tal", "Codigos", UEPA, 10);
            livroControle.adicionarLivro(livro1);
            livroControle.adicionarLivro(livro2);
            
        }
    }
}