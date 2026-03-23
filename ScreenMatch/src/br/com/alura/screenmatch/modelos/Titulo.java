package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exceptions.ConversaoException;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOMDB titulo) {
        this.nome = titulo.title();
        if(titulo.year().length() > 4) {
            throw new ConversaoException("Não foi possível compilar o código por conta de um erro de semântica no ano informado");
        }
        this.anoDeLancamento = Integer.valueOf(titulo.year());
        this.duracaoEmMinutos = Integer
                .valueOf(titulo.runtime().substring(0, 3));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return "nome: '" + nome + '\'' +
                ", ano de lançamento: " + anoDeLancamento +
                ", duração(min): " + duracaoEmMinutos;
    }



}

