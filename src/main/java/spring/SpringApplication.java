package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import spring.aop.LogAspects;
import spring.bean.Car;
import spring.config.AopConfig;
import spring.config.SpringConfig;
import spring.dao.TestDao;


public class SpringApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestDao testDao = app.getBean(TestDao.class);
        LogAspects logAspects = app.getBean(LogAspects.class);
//        car.setSize(100);
        Car car = testDao.carCreate(199);

        System.out.print(app);
    }
}
