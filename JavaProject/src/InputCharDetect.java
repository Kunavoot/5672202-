import java.util.*;

public class InputCharDetect {
    public static void charDetect(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Please Enter Your Character : ");
        try {
            int ch = sn.nextInt();
            System.out.println(ch + " is Number");

        }
        catch (InputMismatchException ex) {
            String ch = sn.nextLine();
            System.out.println(ch + " is Character");
        }
    }

    public static void main(String[] args) {
        charDetect();
    }
}
