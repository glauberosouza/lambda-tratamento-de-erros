package br.com.glauber.exerc20;

public class TesteExcecao {
    public static void main(String[] args) {
        Login login = new Login("Rogun", "123456");

        try {
            login.validarLogin();
            System.out.println("BEM VINDO!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}