package com.treinando.produtos;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Barra de chocolate", 10.50, 25);

        produto1.carrinho();
        produto1.temDesconto();

    }
}