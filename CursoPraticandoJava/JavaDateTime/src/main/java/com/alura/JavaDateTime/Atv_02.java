package com.alura.JavaDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Atv_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String DataProjeto;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite o dia em que você começará o projeto (dd/MM/yyyy): ");
        DataProjeto = input.nextLine();


        LocalDate date = LocalDate.parse(DataProjeto, formatter);
        LocalDate NovaData = date.plusDays(15);

        System.out.println("Você terá até o dia " + NovaData.format(formatter) + " para finalizar seu projeto");
    }

}
