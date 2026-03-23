import java.util.Scanner;

public class scanners_test {

    public static void main(String[] args) {
        int qtd;
        String nome;
        double preco;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo(a) ao nosso Sistema de compras!");

        System.out.println("Qual é o nome do produto?");
        nome = scanner.nextLine();

        System.out.println("Digite a quantidade de produtos no estoque");
        qtd = scanner.nextInt();

        System.out.println("Digite o valor do produto");
        preco = scanner.nextDouble();

        System.out.println("\n=======================================");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade no estoque: " + qtd);
        System.out.println("Valor total em estoque: " + (preco * qtd));


    }
}
