import java.util.*;

public class Excerzises3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter Text 1 - 30 Character: ");
        String txt = sn.nextLine();
        int value = txt.length();
        if (value > 30) {
            System.out.println("Incorrect Please Enter Text 1 - 30 Character");
        }
        else {
            char[] ch = new char[value];
            int upper = 0, ascii = 0;
            for (int i = 0; i < value; i++) {
                ch[i] = txt.charAt(i);
                if ((ascii = ch[i]) <= 90 && (ascii = ch[i]) >= 65) {
                    upper++;
                }
//                System.out.print(ch[i]);
            }
            System.out.println("Text Value : " + value);
            System.out.println("The total number of capital letters : " + upper);
        }
    }
}
