package data;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;
    private String senha;
    private boolean ativa = false;
    private boolean numeroMudado = false;

    // SETTERS AND GETTERS - SETTERS AND GETTERS - SETTERS AND GETTERS - SETTERS AND GETTERS - SETTERS AND GETTERS - SETTERS AND GETTERS

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        numeroMudado = true;
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNovaSenha(String novaSenha) {
        senha = novaSenha;
    }

    public double getSaldo() {
        return saldo;
    }


    // OPERACOES - OPERACOES - OPERACOES - OPERACOES - OPERACOES - OPERACOES - OPERACOES - OPERACOES - OPERACOES - OPERACOES

    public boolean ativarConta() {
        ativa = true;
        return this.ativa;
    }

    public void depositar (double deposito) {

        if (ativa) {
            saldo += deposito;
        } else {
            System.out.println("A conta esta inativa");
        }
    }

public void statusConta() {
    System.out.println("\n\nNome do titular da conta: " + titular);
    System.out.println("Numero da conta: " + numeroConta);
    System.out.println("Saldo atual da conta: " + saldo);

    if(ativa) {
        System.out.println("A conta atualmente esta ativa");
    } else {
        System.out.println("A conta atualmente esta inativa");
    }
}

}
