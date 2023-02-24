package com.example.demointerview.intercepter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LogConfiguration {
    @Bean
    public LogAspect myLog() {
        return new LogAspect();
    }

    @Bean
    @ConditionalOnMissingBean
    WebMvcConfigurer webMvcConfigurer() {
        return new InterceptorConfig();
    }
}
