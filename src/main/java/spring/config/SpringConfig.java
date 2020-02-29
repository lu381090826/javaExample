package spring.config;

import org.springframework.context.annotation.*;
import spring.bean.Car;

import javax.annotation.Resource;

@Configuration
@ComponentScan("spring")
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    @Primary
    public Car car() {
        Car car = new Car();
        car.setSize(123);
        System.out.println("car bean inited");
        return car;
    }

    @Bean
    public Car car2() {
        Car car = new Car();
        car.setSize(223);
        System.out.println("car2 bean inited");
        return car;
    }

}
