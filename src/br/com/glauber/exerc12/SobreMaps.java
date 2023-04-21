package br.com.glauber.exerc12;

import java.util.List;
import java.util.function.UnaryOperator;

public class SobreMaps {
    public static void main(String[] args) {
        var jogosFavoritos = List.of(
                "World of warcraft",
                "League of Legends",
                "Dota",
                "Monster Hunter"
        );
        UnaryOperator<String> nota10 = jogo -> jogo + " É NOTA 10";
        UnaryOperator<String> textoParaMaiusculo  = String::toUpperCase;
        jogosFavoritos.stream()
                .map(nota10)
                .map(textoParaMaiusculo)
                .forEach(System.out::println);
    }
}