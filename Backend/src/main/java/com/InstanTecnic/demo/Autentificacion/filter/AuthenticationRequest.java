package com.InstanTecnic.demo.Autentificacion.Modelos;

public class AuthenticationRequest{

    private String username;
    private String password;
    private String tipo;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String username, String password, String tipo) {
        this.username = username;
        this.password = password;
        this.tipo = tipo;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}