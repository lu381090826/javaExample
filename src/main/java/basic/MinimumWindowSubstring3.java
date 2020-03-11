package basic;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring3 {


    public static void main(String[] args) {
        String s = "A";
        String t = "B";
        MinimumWindowSubstring3Data data = new MinimumWindowSubstring3Data();
        System.out.print(data.out(s, t));
    }
}

class MinimumWindowSubstring3Data {
    public String out(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (need.containsKey(t.charAt(i))) {
                need.put(t.charAt(i), need.get(t.charAt(i)) + 1);
            } else {
                need.put(t.charAt(i), 1);
            }
        }

        int left = 0;
        int lenght = Integer.MAX_VALUE;
        int found = 0;
        int right, head = 0, end = 0;
        for (right = 0; right < s.length(); right++) {
            if (need.containsKey(s.charAt(right))) {
                if (need.get(s.charAt(right)) > 0) {
                    found++;
                }
                need.put(s.charAt(right), need.get(s.charAt(right)) - 1);
            }

            while (found == t.length()) {
                if (right - left < lenght) {
                    lenght = right - left;
                    head = left;
                    end = right;
                }
                if (need.containsKey(s.charAt(left))) {
                    if (need.get(s.charAt(left)) >= 0) {
                        found--;
                    }
                    need.put(s.charAt(left), need.get(s.charAt(left)) + 1);
                }
                left++;
            }
        }
        if (lenght == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(head, end + 1);
    }
}