package com.alura.ScreenMatch2.service;

import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{

    //CLASSE DO JACKSON QUE MAPEIA E TRANSFORMA O JSON EM ATRIBUTOS DO OBJETO
    private ObjectMapper mapper = new ObjectMapper();

    //INTERFACE (IConverteDados) QUE IMPLEMENTA ESSE METODO COM UMA VARIAVEL GENERICA E COM CLASSE GENERICA TAMBEM
    //<T> T SIGNIFICA CLASSE E OBJETO GENERICOS
    @Override
    public <T> T obterDados(String json, Class<T> classe) {

        try {
            //RETURN MAPPER VAI RETORNAR A TRANSFORMACAO DO JSON PARA ATRIBUTOS
            return mapper.readValue(json, classe);

            //TRY CATCH CASO DE ERRADO
        }  catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
