package com.answer.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //���ʸ�Ŀ¼��ת��
        registry.addViewController("/").setViewName("forward:/client/index.html");


    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //��̬��Դ����
        registry.addResourceHandler("/static/**").addResourceLocations("classpath/static/**").resourceChain(true);
    }
}
