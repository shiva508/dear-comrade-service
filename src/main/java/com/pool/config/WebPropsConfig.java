package com.pool.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "web.cors")
@Data
public class WebPropsConfig {

   private String [] allowedOrigins;
   private String [] allowedMethods;
   private Long maxAge;
   private String [] allowedHeaders;
   private String [] exposedHeaders;
   private String [] addMapping;
}
