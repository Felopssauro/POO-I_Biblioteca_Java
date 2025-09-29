package entidades; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Banco_De_Dados {

    private static Banco_De_Dados instancia;

    final Map<Integer, Cliente> clientes;
    final Map<String, Livro> livros;
    final Map<Integer, Editora> editoras;
    final Map<Integer, Compra> compras;

    private Banco_De_Dados() {
        this.clientes = new HashMap<>();
        this.livros = new HashMap<>();
        this.editoras = new HashMap<>();
        this.compras = new HashMap<>();
    }

    public static synchronized Banco_De_Dados getInstance() {
        if (instancia == null) {
            instancia = new Banco_De_Dados();
        }
        return instancia;
    }

    // Salvar e Buscar

    public void salvarCliente(Cliente cliente) { clientes.put(cliente.getID(), cliente); }
    public Cliente buscarClientePorId(int id) { return clientes.get(id); }
    public List<Cliente> listarTodosClientes() { return new ArrayList<>(clientes.values()); }
    public boolean removerCliente(int id) { return clientes.remove(id) != null; }

    public void salvarLivro(Livro livro) { livros.put(livro.getIsbn(), livro); }
    public Livro buscarLivroPorIsbn(String isbn) { return livros.get(isbn); }
    public List<Livro> listarTodosLivros() { return new ArrayList<>(livros.values()); }
    public boolean removerLivro(String isbn) { return livros.remove(isbn) != null; }

    public void salvarEditora(Editora editora) { editoras.put(editora.getID(), editora); }
    public Editora buscarEditoraPorId(int id) { return editoras.get(id); }
    public List<Editora> listarTodasEditoras() { return new ArrayList<>(editoras.values()); }
    public boolean removerEditora(int id) { return editoras.remove(id) != null; }
    
    public void salvarCompra(Compra compra) { compras.put(compra.getId(), compra); }
    public List<Compra> listarTodasAsCompras() { return new ArrayList<>(compras.values()); }
    public List<Compra> buscarComprasPorCliente(int idCliente) {
    List<Compra> resultado = new ArrayList<>();
    for (Compra c : compras.values()) {
        if (c.getIdCliente() == idCliente) {
            resultado.add(c);
        }
    }
    return resultado;
    }
}