package br.com.glauber.exerc4;

import java.util.function.Predicate;

public class SobrePredicate {
    public static void main(String[] args) {
        Login login = new Login(true, "glauber@", "12345678");

        System.out.println("É admin: " + login.isAdminValid());

        Predicate<String> frase = condicao -> !condicao.isBlank()
                && condicao.length() == 46;

        var fraseCompleta = "Eu sou um estudante de programação, na lkdlska";
        System.out.println("Frase com espaços em branco e o tamanho 46? " + frase.test(fraseCompleta));
    }
}