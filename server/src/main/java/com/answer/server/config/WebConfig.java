package com.answer.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //访问根目录是转向
        registry.addViewController("/").setViewName("forward:/client/index.html");


    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //静态资源放行
        registry.addResourceHandler("/static/**").addResourceLocations("classpath/static/**").resourceChain(true);
    }
}
