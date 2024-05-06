public class ContaEspecial extends Conta{

    private double chequeEspecial;

    public ContaEspecial(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void sacar(double valor) {
        if (getSaldo() + getChequeEspecial() < valor) {
            throw new IllegalArgumentException("Valor do saque excede o saldo + cheque especial");
        } else {
            saldo -= valor;
        }

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Especial ===");
        super.imprimirInfosComuns();
        System.out.println("Cheque Especial + Saldo da conta: " + (getChequeEspecial() + getSaldo()));

    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
