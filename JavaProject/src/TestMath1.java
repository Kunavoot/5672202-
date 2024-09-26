import java.util.*;
import java.lang.*;

public class TestMath1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please Input 2 Integer Value and press Enter : ");
        int x = sn.nextInt();
        int y = sn.nextInt();
        int max = Math.max(x,y);
        if (max == x) {
            System.out.println("x > y and Max Value is " + max);
        }
        else {
            System.out.println("y > x and Max Value is " + max);
        }
    }
}
