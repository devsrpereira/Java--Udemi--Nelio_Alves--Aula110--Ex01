package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2023-05-02");
        LocalDateTime d02 = LocalDateTime.parse("2023-05-02T21:43:28");
        Instant d03 = Instant.parse("2023-05-02T21:43:28Z");

        LocalDate d01Menos7Dias = d01.minusDays(7);
        LocalDate d01Mais7Dias = d01.plusDays(7);


        System.out.println("d01 = "+d01);
        System.out.println("d01Menos7Dias = "+d01Menos7Dias);
        System.out.println("d01Mais7Dias = "+d01Mais7Dias);


        LocalDateTime d02Menos7h = d02.minusDays(7);
        LocalDateTime d02Mais7h = d02.plusDays(7);

        System.out.println();
        System.out.println("d02 = "+d02);
        System.out.println("d02Menos7h = "+d02Menos7h);
        System.out.println("d02Mais7h = "+d02Mais7h);


        Instant d03Mais7dias = d03.plus(7, ChronoUnit.DAYS);
        Instant d03Menos7dias = d03.minus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("d03 = "+d03);
        System.out.println("d03Menos7dias = "+d03Menos7dias);
        System.out.println("d03Mais7dias = "+d03Mais7dias);

        Duration t1 = Duration.between(d01Menos7Dias.atTime(0,0), d01.atTime(0,0));
        Duration t2 = Duration.between(d01Menos7Dias.atStartOfDay(), d01.atStartOfDay());
        Duration t3 = Duration.between(d02Menos7h, d02);

        System.out.println();
        System.out.println("t1 DIAS = " + t1.toDays());
        System.out.println("t2 DIAS = " + t2.toDays());
        System.out.println("t3 DIAS = " + t3.toDays());
    }
}
