package spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringValueResolver;

public class Car  {

    private int size = 10;

    public void setSize(int num) {
        size = num;
    }

    public int getSize() {
        return size;
    }

    public void maxSize() {
        this.size = 1000;
    }

    public void setBeanName(String name) {
        System.out.println("Bean name is = " + name);
    }

//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("applicationContext=========" + applicationContext);
//        System.out.println("getApplicationName=========" + applicationContext.getApplicationName());
//    }
//
//    public void setEmbeddedValueResolver(StringValueResolver resolver) {
//        String door = resolver.resolveStringValue("door");
//
//        System.out.println("door===========" + door);
//    }
}
