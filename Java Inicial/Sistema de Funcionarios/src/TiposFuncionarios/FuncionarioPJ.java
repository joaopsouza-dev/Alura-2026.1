package TiposFuncionarios;

public class FuncionarioPJ extends Funcionario {

    private double imposto;


    @Override
    public double getSalarioFinal() {
        double salarioFinal;
        salarioFinal = getSalarioBase() - imposto;
        return salarioFinal;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
