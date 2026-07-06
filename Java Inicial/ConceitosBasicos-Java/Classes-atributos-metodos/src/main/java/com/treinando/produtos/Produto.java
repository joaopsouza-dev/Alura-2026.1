package com.treinando.produtos;

import java.util.Scanner;

public class Produto implements IDesconto {

    private String nome;
    private double preco;
    private int quantidade;

    public void carrinho() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de " + this.nome + " que você vai querer: ");
        int quant = input.nextInt();
        this.preco *= quant;

        System.out.println("O preço dos produtos de acordo com a quantidade ficou de: " + this.preco + "R$");

    }

    @Override
    public void temDesconto() {
        System.out.println("\n=================================================================");
        System.out.println("É mês de Páscoa! Todos os produtos estão com 15% de desconto!");
        this.preco -= this.preco * 0.15;
        System.out.println("O valor do " + this.nome + " com o desconto agora é: " + this.preco + " R$");
        System.out.println("=================================================================");

    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

