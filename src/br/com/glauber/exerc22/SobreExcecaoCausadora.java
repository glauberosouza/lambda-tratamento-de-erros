package br.com.glauber.exerc22;

public class SobreExcecaoCausadora {
    public static void main(String[] args) {
        metodoA(null);
    }

    public static void metodoA(String texto) {
        try {
            metodoB(texto);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
    public static void metodoB(String texto) {
        if (texto.isBlank()) {
            throw new NullPointerException("Valor Nulo");
        }
        System.out.println(texto);
    }
}