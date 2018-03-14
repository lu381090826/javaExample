package aopTest.aopHello;

import util.Level;
import util.Logger;

/**
 * Created by Gavinlu on 2018/3/13.
 */
public class HelloProxy implements IHello {
    private IHello hello;

    public HelloProxy(IHello hello) {
        this.hello = hello;
    }

    public void sayHello(String name) {
        Logger.logging(Level.DEBUGE, "sayHello method start.");
        hello.sayHello(name);
        Logger.logging(Level.INFO, "sayHello method end!");

    }

}