package aopTest.aopHello;

/**
 * Created by Gavinlu on 2018/3/13.
 */
public class Hello implements IHello {

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

}