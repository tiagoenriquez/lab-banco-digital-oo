import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
    
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void imprimirClientes() {
        System.out.println(" *** Relação de Clientes *** ");
        Set<Cliente> clientes = new HashSet<>(contas.stream().map(conta -> conta.getCliente()).toList());
        clientes.forEach(cliente -> System.out.println(cliente.getNome()));
    }

}
