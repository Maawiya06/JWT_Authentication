package com.jwt.Model;

public class JWTRequest {

    private String email;
    private String password;

    public JWTRequest(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public JWTRequest(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "JWTRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
