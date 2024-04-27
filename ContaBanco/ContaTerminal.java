import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira a sua agencia: ");
        int agencia = scanner.nextInt();

        System.out.print("Informe o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.print("Informe o seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);
    }
}
