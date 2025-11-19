import java.util.Scanner;

public class SistemaFin {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carteira titularPrincipal = new Carteira(
                "Ismael Reckiegel",
                123456789,
                0);

        int option;

        do {
            System.out.println("1 - Exibir Carteira / 2 - Depositar Saldo / 3 - Sacar Saldo / -1 - Encerrar");
            option = teclado.nextInt();
            switch (option) {
                case 1:
                    System.out.println(titularPrincipal.exibirDadosCarteira());
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = teclado.nextDouble();
                    if (titularPrincipal.depositarSaldo(valorDeposito)) {
                        System.out.println("Valor depositado com sucesso!");
                    } else{
                        System.out.println("Valor incompatível!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = teclado.nextDouble();
                    if (titularPrincipal.sacarSaldo(valorSaque)) {
                        System.out.println("Valor sacado com sucesso!");
                    } else {
                        System.out.println("Valor insuficiente!");
                    }
                    break;
                case -1:
                    System.out.println("Obrigado por usar o Sistema!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        } while (option != -1);

        teclado.close();
    }
}
