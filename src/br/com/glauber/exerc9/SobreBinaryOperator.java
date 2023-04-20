package br.com.glauber.exerc9;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class SobreBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Double> calcularMedia = (nota1, nota2) -> (nota1 + nota2) / 2;

        var media = calcularMedia.apply(8.0, 7.0) ;
        System.out.println("A sua média é: " + media);

        BiFunction<Double, Double, String> verificarAprovacao = (nota1, nota2) -> ((nota1 + nota2) / 2)
                >= 6 ? "Foi Aprovado" : "Foi Reprovado";
        System.out.println(verificarAprovacao.apply(8.0,8.0));

        Function<Double, String> verificarAprovacaoo = valor -> valor >= 6 ? "Foi Aprovado" : "Foi Reprovado";
        System.out.println(calcularMedia.andThen(verificarAprovacaoo).apply(8.0,8.0));
    }
}