package br.com.glauber.exerc5;

import java.util.function.Predicate;

public class Login {
    private boolean admin;
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public Login(boolean admin, String user, String password) {
        this.admin = admin;
        this.user = user;
        this.password = password;
    }

    public boolean isAdminValid() {
        Predicate<Login> validAdmin = login -> login.admin &&
                (!login.user.isBlank() && login.user.contains("@")) &&
                (!login.password.isBlank() && login.password.length() >= 6);
        return validAdmin.test(this);
    }
}