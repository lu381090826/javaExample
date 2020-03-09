package basic;

public class test {
    public static void main(String[] args) {
        int s = 0;
        int a = 0;
        for (int i = 0; i < 10; i++) {
//            a = ++s;
            a = s++;
        }
        System.out.printf(String.valueOf(a));
    }
}
