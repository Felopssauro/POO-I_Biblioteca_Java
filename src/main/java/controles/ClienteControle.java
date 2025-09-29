package controles;
/**
 *
 * @author driel
 */
import entidades.Banco_De_Dados; 
import entidades.Cliente;
import java.util.List;
import java.util.Optional;

public class ClienteControle {
    private final Banco_De_Dados db = Banco_De_Dados.getInstance();
    
    private int getNextId() {
        return db.listarTodosClientes()
                 .stream()
                 .mapToInt(Cliente::getID)
                 .max()
                 .orElse(0) + 1;
    }

    public ClienteControle() {}

    public List<Cliente> listarTodos() {
        return db.listarTodosClientes();
    }
    
    public void adicionarCliente(String nome, String endereco, String cpfCnpj, String telefone, String tipo) {
    Cliente novoCliente = new Cliente(0, tipo, cpfCnpj, nome, endereco, telefone);
    this.adicionarCliente(novoCliente);
    }

    public void adicionarCliente(Cliente c) {
    if (c == null) throw new IllegalArgumentException("Cliente não pode ser nulo");
    if (c.getNome() == null || c.getNome().isBlank()) {
        throw new IllegalArgumentException("Nome não pode ser vazio");
    }
    if (c.getCPF_CNPJ() == null || c.getCPF_CNPJ().isBlank()) {
        throw new IllegalArgumentException("CPF/CNPJ não pode ser vazio");
    }
    if (buscarPorCpf(c.getCPF_CNPJ()).isPresent()) {
        throw new IllegalArgumentException("Já existe cliente com esse CPF/CNPJ");
    }

    if (c.getID() <= 0) {
        c.setID(getNextId());
    }

    db.salvarCliente(c);
}
    
    public Optional<Cliente> buscarPorCpf(String cpf) {
        if (cpf == null) return Optional.empty();
        return db.listarTodosClientes().stream().filter(c -> cpf.equals(c.getCPF_CNPJ())).findFirst();
    }

    public boolean removerPorCpf(String cpf) {
        if (cpf == null) return false;
        
        Optional<Cliente> clienteParaRemover = buscarPorCpf(cpf);
        if (clienteParaRemover.isPresent()) {
            return db.removerCliente(clienteParaRemover.get().getID());
        }
        return false;
    }

    public boolean atualizarCliente(String cpf, Cliente novo) {
   
        if (cpf == null || novo == null) return false;
        return buscarPorCpf(cpf).map(old -> {
            old.setNome(novo.getNome());
            old.setCPF_CNPJ(novo.getCPF_CNPJ());
            old.setEndereco(novo.getEndereco());
            db.salvarCliente(old); 
            return true;
        }).orElse(false);
    }
    
    public Cliente buscarClientePorId(int id) {
    return db.buscarClientePorId(id);
    }
}