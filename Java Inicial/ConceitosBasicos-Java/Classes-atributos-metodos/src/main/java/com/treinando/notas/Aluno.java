package com.treinando.notas;

import java.util.Scanner;

public class Aluno implements IMedia {

    private String nome;
    private double[] nota = new double[3];
    private double media;



    public void inputNotas() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        this.nome = ler.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota " + (i+1) + " do aluno: ");
            this.nota[i] = ler.nextDouble();

            if(this.nota[i] > 10 || this.nota[i] < 0){
                System.out.println("Nota invalida! Digite novamente.");
                i--;
            }

        }
    }

    @Override
    public double calcularMedia() {
        this.media = 0;

        for (int i = 0; i < 3; i++) {
            this.media += this.nota[i];
        }
        this.media /= 3;

        return this.media;
    }

    public void fichaEscolar() {
        System.out.println("\n=========================\n");
        System.out.println("Aluno: " + this.nome);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nota " + (i+1) + ": %.2f\n", this.nota[i]);
        }
        System.out.printf("Media: %.2f\n", calcularMedia());
        if(this.media >= 7) {
            System.out.println("O aluno foi aprovado\n");
        } else {
            System.out.println("O aluno foi reprovado\n");
        }
        System.out.println("=========================");


    }
}
