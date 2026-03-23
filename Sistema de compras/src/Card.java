import java.util.ArrayList;
import java.util.List;

public class Card {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    public Card(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
