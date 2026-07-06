package br.com.alura.screenmatch.exceptions;

public class ConversaoException extends RuntimeException {

    private String mensagem;

    public ConversaoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
