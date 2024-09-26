import java.util.*;
import java.lang.*;

public class TestRec1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Input Length, Width and then press Enter");
        int length = sn.nextInt();
        int width = sn.nextInt();
        System.out.println("Rectangle Area is : " + length * width);
    }
}
