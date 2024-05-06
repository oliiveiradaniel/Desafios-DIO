
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		ContaEspecial ce = new ContaEspecial(daniel);
		ce.setChequeEspecial(1500);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		ce.depositar(500);

		ce.sacar(2001);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		ce.imprimirExtrato();
	}

}
