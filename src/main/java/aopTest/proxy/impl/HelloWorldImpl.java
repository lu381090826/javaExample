package aopTest.proxy.impl;

import aopTest.proxy.HelloWorld;

/**
 * Created by robin
 */
public class HelloWorldImpl implements HelloWorld {
    public void sayHello() {
        System.out.print("hello world");
    }
}