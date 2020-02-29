package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import spring.aop.LogAspects;

@Configuration
public class AopConfig {
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
