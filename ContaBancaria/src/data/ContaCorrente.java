package data;

public class ContaCorrente extends ContaBancaria implements Transacoes{
    private double debitoCorrente = 55.9;

    public double getDebitoCorrente() {
        return debitoCorrente;
    }

    @Override
    public void sacar() {

    }

    @Override
    public void depositar() {

    }

    @Override
    public void depositar(double deposito) {

        if (ativa) {
            saldo += deposito;
        } else {
            System.out.println("A conta esta inativa");
        }

    }

    @Override
    public void verextrato() {

    }
}
