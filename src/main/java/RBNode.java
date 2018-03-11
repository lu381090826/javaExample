import java.util.HashMap;
import java.util.Map;

class hashMap {
    private static void test() {
        HashMap<String, String> s = new HashMap<String, String>();
        s.put(null, null);
        System.out.print(s);
    }

    public static void main(String[] args) {
        test();
    }
}