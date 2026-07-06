package com.alura.JavaDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Atv_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LocalDate now = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Digite a data do evento (dd/MM/yyyy): ");
        String dtEvento = input.nextLine();

        LocalDate evento = LocalDate.parse(dtEvento, formatter);

        if  (evento.isBefore(now)) {
            System.out.println("O evento já passou!");

        } else if  (evento.isEqual(now)) {
            System.out.println("O evento vai acontecer hoje!");

        } else {
            System.out.println("O evento ainda não aconteceu!");
        }

    }
}
