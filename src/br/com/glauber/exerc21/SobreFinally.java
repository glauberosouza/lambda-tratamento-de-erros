package br.com.glauber.exerc21;

import java.util.Scanner;

public class SobreFinally {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Insira um valor para a divisão: ");
            int valor = entrada.nextInt();
            int divisão = 50 / valor;
            System.out.println("Resultado da Divisão: " + divisão);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na divisão " + e.getMessage());
        }
        /*finally {
            entrada.close();
        }*/
    }
}