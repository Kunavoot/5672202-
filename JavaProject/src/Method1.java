import java.util.*;

public class Method1 {
//    public static int checkVowel(String text) {
//        int count = text.length();
//        int vowel = 0;
//        text = text.toLowerCase();
//        for (int i = 0; i < count; i++) {
//            char ch = text.charAt(i);
//            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
//                vowel++;
//            }
//        }
//        return vowel;
//    }

    public static void checkVowel(String text) {
        int count = text.length();
        int vowel = 0;
        text = text.toLowerCase();
        for (int i = 0; i < count; i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
                vowel++;
            }
        }
        System.out.println("Vowel in Your Text : " + vowel);
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please Input Your Text : ");
        String txt = sn.nextLine();
        checkVowel(txt);
//        System.out.println("Vowel in Your Text : " + checkVowel(txt));
    }
}
