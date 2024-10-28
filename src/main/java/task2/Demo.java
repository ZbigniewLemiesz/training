package task2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zbigniew Lemiesz
 */
public class Demo {

    public static String wordMaxOccurrences(String sentence) {
        String word = null;
        String[] splited = sentence.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : splited) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getKey().equals(s)) {
                        map.replace(s, entry.getValue() + 1);
                        break;
                    }
                }
            }
        }
        Integer maxValue = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                word = entry.getKey();
            }
        }
        return word;
    }


    public static void main(String[] args) {
        System.out.println(wordMaxOccurrences("never never never give up"));
        System.out.println(wordMaxOccurrences("never never never give up up up up"));
        System.out.println(wordMaxOccurrences("never give give up"));
    }
}
