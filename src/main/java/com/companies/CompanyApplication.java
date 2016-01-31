package com.companies;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

 
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class CompanyApplication extends SpringBootServletInitializer{
 
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }
    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CompanyApplication.class);
     }
 
}
