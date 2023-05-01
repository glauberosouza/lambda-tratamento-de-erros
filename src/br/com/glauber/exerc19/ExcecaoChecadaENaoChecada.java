package br.com.glauber.exerc19;

public class ExcecaoChecadaENaoChecada {
    public static void main(String[] args) {
        naoChecada();

        try {
            checada();
        } catch (Exception e) {

        }
    }

    public static void naoChecada() {
        throw new RuntimeException("Não checada");
    }

    public static void checada() throws Exception {
        throw new Exception("Checada");
    }
}