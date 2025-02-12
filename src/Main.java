public class Main {

    public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Yan de Souza Bacelar");
		Cliente cliente2 = new Cliente("Augusto de Jesus Nunes");
		Cliente cliente3 = new Cliente("Anderson Gusmão de Sousa");
		Cliente cliente4 = new Cliente("Cauê Batista Gonçalves");
		Cliente cliente5 = new Cliente("Camila da Silva Braga");

		ContaCorrente contaCorrente1 = new ContaCorrente(cliente3);
		ContaCorrente contaCorrente2 = new ContaCorrente(cliente4);
		ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente4);
		ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente1);

		Banco banco = new Banco("Banco do Tiago");

		banco.adicionarConta(contaCorrente1);
		banco.adicionarConta(contaCorrente2);
		banco.adicionarConta(contaPoupanca1);
		banco.adicionarConta(contaPoupanca2);

		banco.imprimirClientes();

		contaCorrente1.depositar(301.7);
		contaCorrente2.depositar(1262.95);
		contaPoupanca1.depositar(511.68);
		contaPoupanca2.depositar(834.91);

		contaCorrente2.sacar(533.22);
		contaPoupanca1.sacar(601.3);
		contaPoupanca2.sacar(506.82);

		contaPoupanca2.transferir(154.08, contaPoupanca1);

		contaCorrente1.imprimirExtrato();
		contaCorrente2.imprimirExtrato();
		contaPoupanca1.imprimirExtrato();
		contaPoupanca2.imprimirExtrato();
    }

}
