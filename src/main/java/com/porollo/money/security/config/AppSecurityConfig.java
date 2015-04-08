package com.porollo.money.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Dmitriy S. Porollo on 31.03.2015.
 */

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    private String user_login = "user";
    private String admin_login = "admin";
    private String superadmin_login = "super" + admin_login;

    private String user_pass = user_login;
    private String admin_pass = admin_login;
    private String superadmin_pass = superadmin_login;

    private String roleUser = user_login.toUpperCase();
    private String roleAdmin = admin_login.toUpperCase();
    private String roleSuperadmin = superadmin_login.toUpperCase();

    private String hasRoleAdmin = "hasRole('ROLE_" + roleAdmin + "')";



    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser(user_login).password(user_pass).roles(roleUser);
        auth.inMemoryAuthentication().withUser(admin_login).password(admin_pass).roles(roleAdmin);
        auth.inMemoryAuthentication().withUser(superadmin_login).password(superadmin_pass).roles(roleSuperadmin);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/protected/**").access(hasRoleAdmin)
                .antMatchers("/admin/**").access("hasRole('ROLE_SUPERADMIN')")
                .and().formLogin().defaultSuccessUrl("/", false);

    }
}