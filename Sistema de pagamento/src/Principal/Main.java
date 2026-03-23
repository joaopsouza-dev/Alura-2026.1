package Principal;
import TiposDePagamento.Pagamento;
import TiposDePagamento.PagamentoCartao;
import TiposDePagamento.Pix;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var cartao1 = new PagamentoCartao(117.90, "José");
        var cartao2 = new PagamentoCartao(556.80, "Ana Castela");
        var pix1 = new Pix(1459, "Virginia");
        var pix2 = new Pix(8160, "Vini JR");

        var lista = new ArrayList<Pagamento>();

        lista.add(cartao1);
        lista.add(cartao2);
        lista.add(pix1);
        lista.add(pix2);

        for (Pagamento transacao: lista){
            System.out.println("\n=============================================");
            System.out.println("\n" + transacao.toString());
            transacao.infos();

            if(transacao instanceof PagamentoCartao) {
                System.out.println("Tipo: Cartão de Crédito");
            } else if (transacao instanceof Pix){
                System.out.println("\nTipo: Pix");
            }
            transacao.processarPagamento();
        }



    }


}
