package org.javabahia.gestaoalunos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
        builder
                .inMemoryAuthentication()
                .withUser("ivan").password("123").roles("USER").and()
                .withUser("popete").password("123").roles("USER").and()
                .withUser("matheus").password("123").roles("USER");
    }

}
