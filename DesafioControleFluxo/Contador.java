import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (IllegalArgumentException e) {
            System.err.print("O segundo parâmetro deve ser maior que o primeiro!");
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }

    }
    static void contar(int parametroUm, int parametroDois ) {
        if (parametroUm > parametroDois) {
            throw new IllegalArgumentException("O parametro 1 é maior que o parametro 2!");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o numero: " + (i + 1));
        }
    }

}