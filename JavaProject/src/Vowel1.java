import java.util.*;

public class Vowel1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please Enter Character A-Z : ");

        try {
            int x = sn.nextInt();
            System.out.println("Input Invalid");
        }
        catch (InputMismatchException e){
            String x = sn.nextLine();
            x = x.toLowerCase();
            char ch = x.charAt(0);
            switch (ch) {
                case 'a':
                    System.out.println(ch + " is Vowel");
                    break;
                case 'e':
                    System.out.println(ch + " is Vowel");
                    break;
                case 'i':
                    System.out.println(ch + " is Vowel");
                    break;
                case 'o':
                    System.out.println(ch + " is Vowel");
                    break;
                case 'u':
                    System.out.println(ch + " is Vowel");
                    break;
                default:
                    System.out.println(ch + " is Consonant");
                }
            }
        }
    }

