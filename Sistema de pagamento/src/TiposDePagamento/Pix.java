package TiposDePagamento;

import Interfaces.Processavel;

public class Pix extends Pagamento implements Processavel {

    private String chavePix;

    public Pix(double valor, String pagador) {
        super(valor, pagador);
    }

    @Override
    public void processarPagamento() {
        System.out.println("\nCompra via pix processada com sucesso!");
    }

}
