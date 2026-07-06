package TiposFuncionarios;

public class FuncionarioCLT extends Funcionario implements Bonificavel {


    private double descontoBeneficios;

    public double getDescontoBeneficios() {
        return descontoBeneficios;
    }

    public void setDescontoBeneficios(double descontoBeneficios) {
        this.descontoBeneficios = descontoBeneficios;
    }


    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.10;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal;
        salarioFinal = getSalarioBase() + calcularBonus() - descontoBeneficios;
        return salarioFinal;
    }


}
