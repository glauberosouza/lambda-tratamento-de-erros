package br.com.glauber.exerc16;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SobreMinMax {
    public static void main(String[] args) {
        var numeros = List.of(1, 2, 20, 33, 102, 4, 6, 233, 182);
            Comparator<Integer> compararNumero = Integer::compareTo;
            Optional<Integer> menorNumero = numeros.stream().min(compararNumero);
            Optional<Integer> maiorNumero = numeros.stream().max(compararNumero);

            System.out.println("O menor numero da lista é: " + menorNumero.get());
            System.out.println("O maior numero da lista é: " + maiorNumero.get());
    }
}