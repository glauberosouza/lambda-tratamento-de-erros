package br.com.glauber.exerc20;

public class Login {
    private String login;
    private String senha;

    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    public void validarLogin(){
        if (login == null || senha == null){
            throw new IllegalArgumentException("Os valores não podem ser nulos!");
        }
        if(login.isBlank() || senha.isBlank()){
            throw new LoginInvalidException();
        }
    }
}