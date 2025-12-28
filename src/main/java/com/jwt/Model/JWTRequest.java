package com.jwt.Model;

public class JWTRequest {

    private String email;
    private String password;

    // constructors
    public JWTRequest() {
    }

    public JWTRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // ---------- BUILDER ----------
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String email;
        private String password;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public JWTRequest build() {
            return new JWTRequest(email, password);
        }
    }
    // ---------- BUILDER END ----------

    // getters and setters
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
