package controles;

import entidades.Banco_De_Dados;
import entidades.Editora;
import entidades.Livro;
import java.util.List;

public class LivroControle {
    private final Banco_De_Dados db = Banco_De_Dados.getInstance();

    public void adicionarLivro(String isbn, String titulo, String autor, String assunto, Editora editora, int quantidade) {
        Livro novoLivro = new Livro(isbn, titulo, autor, assunto, editora, quantidade);
        this.adicionarLivro(novoLivro);
    }


    public void adicionarLivro(Livro livro) {
        if (livro.getIsbn() == null || livro.getIsbn().isBlank()) {
            throw new IllegalArgumentException("ISBN não pode ser vazio.");
        }
        
        db.salvarLivro(livro);
    }
    
    public List<Livro> listarTodos() {
        return db.listarTodosLivros();        
    }
    
    public Livro buscarLivroPorIsbn(String isbn) {
        return db.buscarLivroPorIsbn(isbn);
    }
}