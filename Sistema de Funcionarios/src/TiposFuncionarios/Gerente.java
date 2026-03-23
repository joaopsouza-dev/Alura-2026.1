package TiposFuncionarios;

public class Gerente extends  FuncionarioCLT {

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.20;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Gerente");
    }
}
