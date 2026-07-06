package com.alura.JavaDateTime;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Atv_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a hora em que você começou o projeto: ");
        LocalTime before = LocalTime.parse(input.nextLine());

        System.out.println("Digite a hora que você terminou o projeto: ");
        LocalTime after = LocalTime.parse(input.nextLine());

        Duration duration = Duration.between(before, after);

        System.out.println("Você demorou "
                + duration.toHoursPart() + " horas e "
                + duration.toMinutesPart() + " minutos para terminar o projeto.");
    }
}