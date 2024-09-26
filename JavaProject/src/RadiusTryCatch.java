import java.util.*;
public class RadiusTryCatch {
    public static void main(String[] args) {
        double r = 0.0d;
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Input Radius and then press Enter");
        try{
            r = sn.nextDouble();
        }
        catch (InputMismatchException e) {
            String s = sn.nextLine();
            System.out.println("The token that caused exception was : " + s );
        }
        System.out.println("Radius is : " + r);
    }
}
