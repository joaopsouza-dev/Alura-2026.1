package com.treinando.livros;

import javax.swing.text.ElementIterator;

public class MainLivros {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setNome("Corte de Espinhos e Rosas");
        livro1.setAutor("Sara J. Mass");
        livro1.setPaginas(390);

        System.out.println(livro1.toString());
    }
}
