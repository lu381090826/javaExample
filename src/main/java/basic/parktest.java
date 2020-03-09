package basic;

import sun.misc.Unsafe;

public class parktest {
    public static void main(String[] args) {
        Unsafe.getUnsafe().park(true,1);
        System.out.printf(String.valueOf(11));
    }
}
