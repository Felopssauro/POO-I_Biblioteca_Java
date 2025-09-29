package controles;

import entidades.Banco_De_Dados; 
import entidades.Editora;
import java.util.List;
import java.util.Optional;

public class EditoraControle {
    private final Banco_De_Dados db = Banco_De_Dados.getInstance();

    private int getNextId() {
        return db.listarTodasEditoras()
                 .stream()
                 .mapToInt(Editora::getID)
                 .max()
                 .orElse(0) + 1;
    }
    
    public EditoraControle() {}

    public List<Editora> listarTodas() {
        return db.listarTodasEditoras();
    }

    public Optional<Editora> buscarPorNome(String nome) {
    if (nome == null) return Optional.empty();
    return db.listarTodasEditoras().stream().filter(e -> nome.equalsIgnoreCase(e.getNome())).findFirst();
}

  
    public void adicionarEditora(String nome, String gerente, String endereco, String telefone) {
  
        Editora novaEditora = new Editora(0, nome, gerente, endereco, telefone);
        
  
        this.adicionarEditora(novaEditora);
    }

    public void adicionarEditora(Editora e) {
        if (e == null) throw new IllegalArgumentException("Editora não pode ser nula");
        if (e.getNome() == null || e.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        
        if (e.getID() <= 0) {
            e.setID(getNextId());
        }
        
        db.salvarEditora(e);
    }
}