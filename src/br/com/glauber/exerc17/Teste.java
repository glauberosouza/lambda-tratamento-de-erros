package br.com.glauber.exerc17;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        var tripulantes = List.of(
                new Tripulante("Gabriel", 27),
                new Tripulante("Glauber", 31),
                new Tripulante("Gabriel", 27),
                new Tripulante("Andreza", 28),
                new Tripulante("Ramon", 35)
        );
        tripulantes.stream().distinct().forEach(System.out::println);
        System.out.println("Usando o skip e o limit: ");
        tripulantes.stream().distinct().skip(2).limit(1)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Usando o takeWhile: ");
        /*
        * takeWhile will abort the stream on the first occurrence of an
        * item which does not satisfy the condition.
        * */
        tripulantes.stream().distinct()
                .takeWhile(tripulante -> tripulante.getIdade() >= 28)
                .forEach(System.out::println);
    }
}