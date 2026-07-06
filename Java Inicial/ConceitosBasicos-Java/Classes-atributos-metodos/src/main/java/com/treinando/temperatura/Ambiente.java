package com.treinando.temperatura;

public class Ambiente {
    private String nome;
    private double temperatura;

    public void checarTemperatura() {
        if(temperatura > 37.5) {
            System.out.println("O ambiente \"" + this.nome + "\" esta MUITO quente!");
        } else if (temperatura < 20 ){
            System.out.println("O ambiente \"" + this.nome + "\" esta MUITO frio!");
        } else {
            System.out.println("O ambiente \""  + this.nome + "\" esta em uma temperatura boa!");
        }
    }

    public Ambiente(String nome, double temperatura) {
        this.nome = nome;
        this.temperatura = temperatura;
    }
}
