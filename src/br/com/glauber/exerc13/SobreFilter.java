package br.com.glauber.exerc13;

import java.util.List;
import java.util.function.Predicate;

public class SobreFilter {
    public static void main(String[] args) {
        var numerosImparesEPares = List.of(10, 22, 8, 3, 14, 5);
        Predicate<Integer> ehNumeroPar = n -> n % 2 == 0;
        numerosImparesEPares.stream()
                .filter(ehNumeroPar)
                .sorted()
                .forEach(System.out::println);
    }
}