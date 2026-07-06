import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double saldoatual = 3500;
        double sacar;
        double deposito;
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************************************");
        System.out.println("Dados da conta bancária do cliente:\n");
        System.out.println("Nome:          João Pedro Souza");
        System.out.println("Tipo de conta:         corrente");
        System.out.printf("Saldo disponível: %.2f reais", saldoatual);
        System.out.println("\n***********************************************");

        while (opcao != 5) {

            //menu de opções para fazer o switch
            System.out.println("\nMenu de opções:");
            System.out.println("1- Consultar saldo atual");
            System.out.println("2- Saque");
            System.out.println("3- Depósito");
            System.out.println("4- Ver extrato atualizado");
            System.out.println("5- Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nSeu saldo atual é de: " + saldoatual);
                    break;

                case 2:
                    System.out.println("\nQuanto você deseja sacar? ");
                    sacar = scanner.nextDouble();
                    if (sacar > saldoatual) {
                        System.out.println("\nSaldo insuficiente para sacar.");
                    } else {
                        saldoatual -= sacar;
                        System.out.println("Saque realizado!");
                        System.out.println("Seu saldo atual agora é de: " + saldoatual);
                    }
                    break;

                case 3:

                    System.out.println("\nQuanto você deseja depositar?");
                    deposito = scanner.nextDouble();
                    saldoatual += deposito;
                    System.out.printf("%.2f foram depositados na sua conta.", deposito);
                    System.out.println("\nSeu saldo atual é de: " + saldoatual);
                    break;

                case 4:

                    System.out.println("\n***********************************************");
                    System.out.println("Dados da conta bancária do cliente:\n");
                    System.out.println("Nome:   João Pedro Souza");
                    System.out.println("Tipo de conta:   corrente");
                    System.out.printf("Saldo disponível: %.2f reais", saldoatual);
                    System.out.println("\n***********************************************");
                    break;

                case 5:
                    System.out.println("\nMuito obrigado por usar nosso sistena. Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Digite um número entre 1-4.");

            }
        }

        scanner.close();
    }
}