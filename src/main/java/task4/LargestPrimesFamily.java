package task4;

import java.util.*;

/**
 * @author Zbigniew Lemiesz
 */
public class LargestPrimesFamily {

    public static void main(String[] args) throws Throwable {
        System.gc();
        showLargestFamily(123456789);
    }

    public static void showLargestFamily(int num) {

        boolean[] numbers = new boolean[num + 1];
        for (int i = 2; i * i <= num; i++) {
            if (numbers[i] == false) {
                for (int j = 2; j * i <= num; j++) {
                    numbers[j * i] = true;
                }
            }
        }

        Map<String, Integer> families = new HashMap<>();
        for (int i = 1; i <= num; i++) {
            if (numbers[i] == false) {
                if (families.containsKey(charSorted(i))) {
                    families.put(charSorted(i), families.get(charSorted(i)) + 1);
                } else {
                    families.put(charSorted(i), 1);
                }
            }
        }

        int res = 0;
        String fam = "";
        for (Map.Entry<String, Integer> entry : families.entrySet()) {
            int v = entry.getValue();
            if (v > res) {
                res = v;
                fam = entry.getKey();
            }
        }
        System.out.println(fam + "  " + res);
    }


    public static String charSorted(Integer integer) {
        char[] s = integer.toString().toCharArray();
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        for (char e : s) {
            sb.append(e);
        }
        return sb.toString();
    }

}
