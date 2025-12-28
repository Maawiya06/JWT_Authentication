package com.jwt.Config;

import com.jwt.security.JWTAuthenticationEntryPoint;
import com.jwt.security.JWTAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Autowired
    private JWTAuthenticationEntryPoint point;
    @Autowired
    private JWTAuthenticationFilter filter;

    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                .csrf(csrf-> csrf.disable())
                .cors(cors-> cors.disable())
                .authorizeHttpRequests(auth-> auth.requestMatchers("/home/**")
                        .authenticated()
                        .requestMatchers("/auth/login").permitAll());

        return httpSecurity.build();
    }
}
