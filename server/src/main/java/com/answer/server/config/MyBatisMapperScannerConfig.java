package com.answer.server.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfig(){
        MapperScannerConfigurer mc=new MapperScannerConfigurer();
        mc.setSqlSessionFactoryBeanName("SqlSessionFactory");
        mc.setBasePackage("com.answer.server.mapper");
        return mc;
    }
}
