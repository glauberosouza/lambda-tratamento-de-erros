package br.com.glauber.exerc5;


import java.util.List;
import java.util.function.Consumer;

public class SobreConsumer {
    public static void main(String[] args) {
        List<Login> logins = List.of(
                new Login(true, "@User1", "123456"),
                new Login(false, "@User2", "7654321"));

        Consumer<Login> imprimeLogins =
                login -> System.out.println("Nome: " + login.getUser() + " Password: " + login.getPassword());
        logins.forEach(imprimeLogins);
    }
}