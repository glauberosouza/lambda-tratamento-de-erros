package br.com.glauber.exerc1;

public class Main {
    public static void main(String[] args) {
         StringMaster paraMaiusculo = texto -> texto.toUpperCase();
         StringMaster paraMinusculo = texto -> texto.toLowerCase();
         StringMaster transformApara4 = texto -> texto.replaceAll("[Aa]", "4");

        System.out.println(paraMaiusculo.transform("Glauber de oliveira souza"));
        System.out.println(paraMinusculo.transform("GLAUBER DE OLIVEIRA SOUZA"));
        System.out.println(transformApara4.transform("Arroz, amora, Abacaxi"));
    }
}