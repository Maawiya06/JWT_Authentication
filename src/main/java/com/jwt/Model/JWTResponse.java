package com.jwt.Model;

public class JWTResponse {

    private String jwtToken;
    private String username;

    // constructors
    public JWTResponse() {
    }

    public JWTResponse(String jwtToken, String username) {
        this.jwtToken = jwtToken;
        this.username = username;
    }

    // ---------- BUILDER ----------
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String jwtToken;
        private String username;

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public JWTResponse build() {
            return new JWTResponse(jwtToken, username);
        }
    }
    // ---------- BUILDER END ----------

    // getters and setters
    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
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
                "jwtToken='" + jwtToken + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
