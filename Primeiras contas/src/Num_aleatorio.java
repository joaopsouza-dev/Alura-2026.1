import java.util.Random;
import java.util.Scanner;

public class Num_aleatorio {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int valorRandom = random.nextInt(100);
        int tentativas = 1;
        int chutes = 500;

        System.out.println("\nBem vindo ao sistema de numeros aleatórios!");
        System.out.println("Você tem 5 tentativas para acertar o número\n");

        while (tentativas <= 5 && chutes != valorRandom) {

            System.out.println("\nDigite um número entre 0-100: ");
            chutes = scanner.nextInt();

            if (chutes >= 0 && chutes <= 100) {

                if (chutes != valorRandom) {
                    System.out.println("Você errou! Número de tentativas: " + tentativas);
                }

                tentativas++;

                if (valorRandom > chutes) {
                    System.out.println("O número é maior que " + chutes);
                } else if (valorRandom < chutes) {
                    System.out.println("O número é menor que " + chutes);
                }

            } else {
                System.out.println("\nNúmero inválido. Tente novamente!\n");
            }
        }

        if (chutes != valorRandom) {
            System.out.println("\nQue pena! Você não conseguiu acertar.O número era " + valorRandom);
        } else {
            System.out.println("\nParabéns! você conseguiu!");
        }

        scanner.close();
    }
}
