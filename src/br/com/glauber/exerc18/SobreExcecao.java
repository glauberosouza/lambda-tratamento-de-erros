package br.com.glauber.exerc18;

public class SobreExcecao {
    public static void main(String[] args) {

        try {
            System.out.println(7 / 0);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na divisão: " + e.getMessage());
        }
        try {
            String name = null;
            imprimirNomeMaiusculo(name);
        } catch (NullPointerException e) {
            System.out.println("Ocorreu erro ao imprimir o nome!");
            e.printStackTrace();
        }
        System.out.println("FIM!");

    }

    public static void imprimirNomeMaiusculo(String nome) {
        System.out.println("Nome maiusculo" + nome.toUpperCase());
    }
}
