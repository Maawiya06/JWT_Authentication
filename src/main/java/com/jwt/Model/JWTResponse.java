package com.jwt.Model;

public class JWTResponse{

    private String JwtToken;
    private String username;

    public JWTResponse(String jwtToken, String username) {
        JwtToken = jwtToken;
        this.username = username;
    }

    public JWTResponse(){}

    public String getJwtToken() {
        return JwtToken;
    }

    public void setJwtToken(String jwtToken) {
        JwtToken = jwtToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "JWTResponse{" +
                "JwtToken='" + JwtToken + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
