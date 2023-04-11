package br.com.glauber.exerc2;



import java.util.function.UnaryOperator;

public class StringMaster2Teste {
    public static void main(String[] args) {


        UnaryOperator<String> paraMaiusculo = texto -> texto.toUpperCase();
        UnaryOperator<String> paraMinusculo = texto -> texto.toLowerCase();
        UnaryOperator<String> transformApara4 = texto -> texto.replaceAll("[Aa]", "4");


        System.out.println(paraMaiusculo.apply("Glauber de oliveira souza"));
        System.out.println(paraMinusculo.apply("GLAUBER DE OLIVEIRA SOUZA"));
        System.out.println(transformApara4.apply("Arroz, amora, Abacaxi"));

    }
}