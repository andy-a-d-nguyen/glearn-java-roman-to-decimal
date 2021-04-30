package romanToDecimal;

import java.util.Hashtable;

public class RomanToDecimal {
    public static int romanToDecimal(String roman) {


        Hashtable<Character, Integer> dict = new Hashtable<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        int total = 0;

        for (int i = 0; i < roman.length(); i++) {
            int current = dict.get(roman.charAt(i));
            int next = i < roman.length() - 1 ? dict.get(roman.charAt(i + 1)) : 0;
            if (current >= next) {
                total += dict.get(roman.charAt(i));
            } else {
                total -= dict.get(roman.charAt(i));
            }
        }
        return total;
    }
}
