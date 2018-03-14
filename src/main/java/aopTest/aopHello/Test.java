package aopTest.aopHello;

/**
 * Created by Gavinlu on 2018/3/13.
 */
public class Test {
    public static void main(String[] args) {
        IHello hello = new HelloProxy(new Hello());
        hello.sayHello("Doublej");
    }
}