package szyfry;

import java.io.Console;

/**
 * @author Zbigniew Lemiesz
 */
public class Demo {


    public static String kodujB(String szyfr, int k) {
        int i = 0;
        String tekst = "";
        while (i < szyfr.length()) {
            char c = (char) ((90 - szyfr.charAt(i) + k) % 26 + 65);
            tekst = tekst + c;
            i = i + 1;
            k = i + k;
        }
        return tekst;
    }

    public static String koduj(String szyfr) {
        int i = 0;
        String tekst = "";
        while (i < szyfr.length()) {
            char c = (char) ((szyfr.charAt(i) - 65 + i + 1) % 26 + 65);
            tekst = tekst + c;
            i++;
        }
        return tekst;
    }

    public static String dekoduj(String szyfr) {
        int i = 0;
        String tekst = "";
        while (i < szyfr.length()) {
            char c = (char) (90 - (90 - szyfr.charAt(i) + i + 1) % 26);
            tekst = tekst + c;
            i++;
        }
        return tekst;
    }

    public static char szyfruj(char zn, int k) {
        int kod_znak = 0;
        kod_znak = kod(zn) + k % 26;
        if (kod_znak <= 90) return znak(kod_znak);
        else {
            kod_znak = kod_znak - 26;
            return znak(kod_znak);
        }
    }

    public static int kod(char zn) {
        return zn;
    }

    public static char znak(int n) {
        return (char) n;
    }


    public static void main(String[] args) {
//        System.out.println(kodujB("FTIMS", 14));
//        System.out.println(kodujB("IVIHF", 14));
//        System.out.println(kodujB("DANKXHI", 14));
//        System.out.println(kodujB("KODJAVA", 14));
//        System.out.println(koduj("BIT"));
//        System.out.println(dekoduj("CKW"));
//        System.out.println(koduj("INFORMATYKA"));
//        System.out.println(dekoduj("JPISWSHBHUL"));
//        System.out.println(dekoduj("ADLSW"));
       System.out.println(szyfruj('M',327));
       System.out.println(szyfruj('Z',12));
       System.out.println(szyfruj('M',145));
       System.out.println(szyfruj('K',763));

    }
}
