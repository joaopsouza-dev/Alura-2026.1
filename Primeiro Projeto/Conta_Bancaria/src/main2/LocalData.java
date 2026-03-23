package main2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalData {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate compra = LocalDate.now();
        LocalDate primeiraParcela = compra.plusMonths(1);
        LocalDate segundaParcela = compra.plusDays(60);
        LocalDate random = LocalDate.of(2026, 3, 5);

        System.out.println(compra.format(formatter));
        System.out.println(primeiraParcela.format(formatter));
        System.out.println(segundaParcela.format(formatter));
        System.out.println(random.format(formatter));
    }
}
