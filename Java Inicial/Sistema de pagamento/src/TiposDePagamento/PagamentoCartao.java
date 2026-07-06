package TiposDePagamento;

import Interfaces.Processavel;

public class PagamentoCartao extends Pagamento implements Processavel {

    private String numeroCartao;
    private int parcelas;
    private double taxa = 0.03;

    public PagamentoCartao(double valor, String pagador) {
        super(valor, pagador);
    }

    @Override
    public void processarPagamento() {
        System.out.println("\nCompra via cartão processada com sucesso!");
    }

    @Override
    public double valorTotal() {

        return getValor() + (getValor() * taxa);
    }

    @Override
    public void infos() {
        super.infos();
        System.out.println("\nTaxas totais: " + (int) (taxa * 100) + "%");
    }
}
