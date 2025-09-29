package controles;

import entidades.Banco_De_Dados;
import entidades.Compra;
import entidades.Cliente;
import entidades.Livro;
import java.time.LocalDate;
import java.util.List;

public class CompraControle {

    private final Banco_De_Dados db = Banco_De_Dados.getInstance();

    private int getNextId() {
        return db.listarTodasAsCompras().size() + 1;
    }
    
    public void realizarCompra(Cliente cliente, String isbnLivro, int quantidade) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido.");
        }
        
        Livro livro = db.buscarLivroPorIsbn(isbnLivro);
        if (livro == null) {
            throw new IllegalArgumentException("Livro com o ISBN informado não existe.");
        }
        
        if (livro.getQuantidadeEmEstoque() < quantidade) {
            throw new IllegalArgumentException("Estoque insuficiente. Disponível: " + livro.getQuantidadeEmEstoque());
        }

        for (int i = 0; i < quantidade; i++) {
            Compra novaCompra = new Compra(getNextId() + i, cliente.getID(), isbnLivro, LocalDate.now());
            db.salvarCompra(novaCompra);
        }

        livro.setQuantidadeEmEstoque(livro.getQuantidadeEmEstoque() - quantidade);
        db.salvarLivro(livro);
    }
    
    public List<Compra> buscarComprasPorCliente(int idCliente) {
        return db.buscarComprasPorCliente(idCliente);
    }
}