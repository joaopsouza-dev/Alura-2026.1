package com.alura.ScreenMatch2.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

    // ESSA INTERFACE E UM "CONTRATO" QUE TEMOS. NESSE AQUI, ELE IMPLEMENTA O METODO QUE PEGA UM OBJETO GENERICO E TRANSFORMA O JSON EM ATRIBUTOS DO OBJETO
}
