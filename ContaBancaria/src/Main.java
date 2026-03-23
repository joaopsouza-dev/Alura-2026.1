import data.ContaBancaria;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Ana Castela");
        conta.setNumeroConta(61063);
        conta.setNovaSenha("2309");

        conta.depositar(1500);

        System.out.println("\n" + conta.getSaldo());
        conta.statusConta();


        conta.ativarConta();
        conta.depositar(1000);

        System.out.println("\n" + conta.getSaldo());
        conta.statusConta();

    }
}
