package task1;

/**
 * @author Zbigniew Lemiesz
 */
public class Demo {
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        char[] w1 = new char[26];
        char[] w2 = new char[26];
        for (int i = 0; i < word1.length(); i++) {
            char letter = word1.charAt(i);
            int index = (int) letter - 'a';
            w1[index]++;
        }
        for (int i = 0; i < word2.length(); i++) {
            char letter = word2.charAt(i);
            int index = (int) letter - 'a';
            w2[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if (w1[i] != w2[i]) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("abba", "baba"));
        System.out.println(isAnagram("keson", "nosek"));
        System.out.println(isAnagram("bark", "krab"));
        System.out.println(isAnagram("aabbccdd", "ddaaccee"));
    }
}
