package com.porollo.money.security.config.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by Dmitriy S. Porollo on 31.03.2015.
 */

@Configuration
@EnableWebMvc
@ComponentScan({"com.porollo.money.security.config", "com.porollo.money.security.controllers"})

public class WebConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/views/"); // Attention !
        viewResolver.setSuffix(".jsp"); //.jsp
        return viewResolver;
    }
}