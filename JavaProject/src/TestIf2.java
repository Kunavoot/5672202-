import java.util.*;

public class TestIf2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Input 1 - 10");
        int num = sn.nextInt();
        if (num >= 1 && num <= 10) {
            if (num < 5) {
                System.out.println("num more less 5");
            }
            else if (num > 5) {
                System.out.println("num more than 5");
            }
            else {
                System.out.println("num is 5");
            }
        }
        else {
            System.out.println("Invalid Number");
        }
    }
}
