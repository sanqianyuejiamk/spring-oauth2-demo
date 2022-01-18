package com.juanzero.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.security.web.servlet.support.csrf.CsrfRequestDataValueProcessor;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.support.RequestDataValueProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjmendoza on 14/7/2017.
 */
@Configuration
@EnableOAuth2Sso
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Value("${auth-server}/exit")
    private String logoutUrl;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http.logout()
                .logoutSuccessUrl(logoutUrl)
                .and()
                .authorizeRequests().anyRequest().authenticated()
                .and()
                 //TODO:先禁用csrf安全校验
//                .addFilterAfter(new CsrfHeaderFilter(), CsrfFilter.class);//把CSRFtoken设定到cookie
                .csrf().disable();
//                 .addFilter(csrfFilter());

//        http.addFilterAfter(new CsrfCookieFilter(), CsrfFilter.class);
    }

    /**
    @Bean
    public RequestDataValueProcessor requestDataValueProcessor() {
        return new CsrfRequestDataValueProcessor();
    }

    @Bean
    public HttpSessionCsrfTokenRepository httpSessionCsrfTokenRepository(){
        HttpSessionCsrfTokenRepository httpSessionCsrfTokenRepository = new HttpSessionCsrfTokenRepository();
        httpSessionCsrfTokenRepository.setHeaderName("X-SECURITY");
        return httpSessionCsrfTokenRepository;
    }

    @Bean
    public CsrfFilter csrfFilter(){
        return new CsrfFilter(httpSessionCsrfTokenRepository());
    }
    */
}
