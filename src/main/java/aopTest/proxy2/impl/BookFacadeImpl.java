package aopTest.proxy2.impl;

import aopTest.proxy2.BookFacade;

/**
 * Created by Gavinlu on 2018/3/9.
 */
public class BookFacadeImpl implements BookFacade {
    @Override
    public void addBook() {
        System.out.println("增加图书方法。。。");
    }
}
