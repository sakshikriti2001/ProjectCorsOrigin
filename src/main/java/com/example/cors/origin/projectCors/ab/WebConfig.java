package com.example.cors.origin.projectCors.ab;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry)

    {
        corsRegistry.addMapping("/**")
                .allowedHeaders("*")
                .allowedMethods("GET", "PUT", "POST", "DELETE")
                .allowedOrigins("http://localhost:5500");
    }
}
