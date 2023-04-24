package br.com.glauber.exerc15;

import java.util.List;
import java.util.function.Predicate;

public class SobreMatch {
    public static void main(String[] args) {
        var nomes = List.of("Glauber", "Andreza", "Priscila", "Aline");

        Predicate<String> nomeComLetraA = nome -> nome.toLowerCase().contains("a");
        Predicate<String> nomeComMaisDe3Letras = nome -> nome.length() > 3;
        var nomeSemLetraA = nomeComLetraA.negate();

        System.out.println("Nomes possuem a letra A: " + nomes.parallelStream()
                .allMatch(nomeComLetraA));
        System.out.println("Nomes sem a letra A: " + nomes.parallelStream()
                .anyMatch(nomeSemLetraA));
        System.out.println("Nomes possuem a letra A: " + nomes.parallelStream()
                .noneMatch(nomeComMaisDe3Letras));
    }
}