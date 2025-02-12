
public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("Conta " + numero + ": Saque realizado com sucesso");
        } else {
            System.out.println("Conta " + numero + ": Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Conta " + numero + ": Depósito realizado com sucesso");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (saldo > valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Conta " + numero + ": Transferência realizada com sucesso");
        } else {
            System.out.println("Conta " + numero + ": Saldo insuficiente");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
