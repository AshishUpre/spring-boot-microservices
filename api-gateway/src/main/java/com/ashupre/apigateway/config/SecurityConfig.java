package com.ashupre.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    /**
     * Make them accessible without auth
     */
    private final String[] unauthorizedEndpoints = {
            "/eureka/**",
            "/swagger-ui/**",
            "/aggregate/**",
            "/api-docs/**",
            "/v3/api-docs/**",
            "/swagger-resources/**",
            "/actuator/prometheus"
    };

    /**
     * Must be of name filterChain and not securityFilterChain().
     * https://stackoverflow.com/questions/76910339/facing-error-parameter-0-of-method-securityfilterchain-required-a-bean-of-type
     * second ans says so (no reasoning)
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(authorize ->
                        authorize
                                .requestMatchers(unauthorizedEndpoints).permitAll() // permit unauthorizedEndpoints
                                .anyRequest().authenticated()
                )
                .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()))
                .build();
    }
}

