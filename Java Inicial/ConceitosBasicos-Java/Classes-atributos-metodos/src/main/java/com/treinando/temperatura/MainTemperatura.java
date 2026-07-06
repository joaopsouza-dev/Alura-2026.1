package com.treinando.temperatura;

public class MainTemperatura {
    public static void main(String[] args) {

        Ambiente ambiente1 = new Ambiente("Sala A", 36);
        Ambiente ambiente2 = new  Ambiente("Sala B", 42.5);
        Ambiente ambiente3 = new  Ambiente("Sala C", 17.2);

        ambiente1.checarTemperatura();
        ambiente2.checarTemperatura();
        ambiente3.checarTemperatura();
    }


}
