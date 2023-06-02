package com.gooks.blacklabel.common.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.gooks.blacklabel.common.security.filter.JwtAuthenticationFilter;
import com.gooks.blacklabel.common.security.jwtUtil.JwtTokenProvider;

import lombok.RequiredArgsConstructor;

//https://gksdudrb922.tistory.com/217#member%--%ED%--%-C%EC%-D%B-%EB%B-%--
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
 
    private final JwtTokenProvider jwtTokenProvider;
 
    private static final String[] AUTH_WHITE_LIST = {
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/v2/api-docs/**",
            "/swagger-resources/**",
            "/h2-console/**",
            "/console/**",
            "/account/**",
            "/members/login"
    };
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .httpBasic().disable()
            .csrf().disable()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeRequests()
            .antMatchers("/h2-console/**").permitAll()
            .antMatchers("/members/login").permitAll()                
            .antMatchers("/members/test").hasRole("USER")
            .anyRequest().authenticated()
            .and()
            .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class)
            .headers().frameOptions().disable();
        return http.build();
    }
 
    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}