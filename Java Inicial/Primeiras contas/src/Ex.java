public class Ex {

    public static void main(String[] args) {

        double nota1 = 7.5;
        double nota2 = 6.75;
        double nota3 = 8.3;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("a media geral do aluno e: %.2f%n", media);

        double pi = 3.1459;
        int pi_int = (int) pi;

        System.out.println(pi_int);

        char letra = 'c';
        int idade = 18;

        System.out.printf("%c %d", letra, idade);

        double precoProduto = 20.50;
        int qtd = 4;
        double total = precoProduto * qtd;

        System.out.println("\nO valor total e: " + total);

        double precoDolar = 6.2;
        int reais = 549;
        double conversao = reais * precoDolar;

        System.out.printf("O valor de %d reais em dolares e de: %.2f $", reais, conversao);

        double original = 680.50;
        double desconto = original * 0.10;
        double aplicado = original - desconto;

        System.out.println("preco original: " + original);
        System.out.println("preco com desconto: " + aplicado);
    }


}
