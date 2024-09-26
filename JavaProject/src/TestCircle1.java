import java.util.*;
import java.lang.*;

public class TestCircle1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please input Radius and then press Enter");
        double r = sn.nextDouble();
        System.out.println("Circle Area is : " + Math.PI * Math.pow(r,2));
    }
}
