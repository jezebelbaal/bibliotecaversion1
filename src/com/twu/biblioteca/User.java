package com.twu.biblioteca;

/**
 * Created by jutsch on 8/11/16.
 */
public class User {

    private String login;
    private String password;
    private String name;
    private String email;
    private String telephone;


    public User(String login, String password, String name, String email, String telephone) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
