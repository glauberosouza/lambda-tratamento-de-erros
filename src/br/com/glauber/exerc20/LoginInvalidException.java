package br.com.glauber.exerc20;

public class LoginInvalidException extends RuntimeException{
    public LoginInvalidException() {
        super("Login e/ou senha inválidos!");
    }
}