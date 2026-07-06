package TiposDePagamento;

import Interfaces.Processavel;

public abstract class Pagamento implements Processavel {
    private double valor;
    private String pagador;

    public Pagamento(double valor, String pagador) {
        this.valor = valor;
        this.pagador = pagador;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public void infos (){
        System.out.println("\nNome do Pagador: " + pagador);
        System.out.printf("Valor total do pagamento: %.2f", valorTotal());

    }

    public double valorTotal() {
        return getValor();
    }

    @Override
    public void processarPagamento() {

    }
}
