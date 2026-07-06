package TiposFuncionarios;

public class SistemaFolhaDePagamento {

    public static void main(String[] args) {

        FuncionarioCLT f1_pf = new FuncionarioCLT();

        f1_pf.setCpf(55667788);
        f1_pf.setDescontoBeneficios(325);
        f1_pf.setIdade(24);
        f1_pf.setNome("João Carlos");
        f1_pf.setSalarioBase(2500.50);


        f1_pf.calcularBonus();

        f1_pf.exibirDados();
        System.out.println("O salário final de " + f1_pf.getNome() + " é de: " + f1_pf.getSalarioFinal() + " reais");

        FuncionarioPJ f1_pj = new FuncionarioPJ();

        f1_pj.setNome("Isaque");
        f1_pj.setCpf(112233);
        f1_pj.setImposto(125);
        f1_pj.setSalarioBase(3500.50);
        f1_pj.setIdade(35);

        f1_pj.exibirDados();
        System.out.println("O salário final de " + f1_pj.getNome() + " é de: " + f1_pj.getSalarioFinal() + " reais");

        Gerente g1 = new Gerente();

        g1.setNome("Ana Raquel");
        g1.setCpf(889977);
        g1.setSalarioBase(5000);
        g1.setIdade(25);
        g1.setDescontoBeneficios(230);

        g1.exibirDados();
        System.out.println("O salário final de " + g1.getNome() + " é de: " + g1.getSalarioFinal() + " reais");
    }
}
