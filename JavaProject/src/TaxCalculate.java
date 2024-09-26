import java.util.*;

public class TaxCalculate {
    public static void tax(double money) {
        if (money > 4000000) {
            money -= 4000000;
            System.out.println("Your Tax : " + String.format("%.2f",money * 0.37 + 1045000) + " Bath");
        }
        else if (money > 1000000) {
            money -= 1000000;
            System.out.println("Your Tax : " + String.format("%.2f",money * 0.3 + 145000) + " Bath");
        }
        else if (money > 500000) {
            money -= 500000;
            System.out.println("Your Tax : " + String.format("%.2f",money * 0.2 + 45000) + " Bath");
        }
        else if (money > 100000) {
            money -= 100000;
            System.out.println("Your Tax : " + String.format("%.2f",money * 0.1 + 5000) + " Bath");
        }
        else if (money >= 0) {
            System.out.println("Your Tax : " + String.format("%.2f",money * 0.05) + " Bath");
        }
        else {
            System.out.println("Hey!! Your Money Less Than 0!!!");
        }
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double []money = new double[10];
        boolean error = false;
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print(i+1 + " : Please Enter Your Money : ");
                money[i] = sn.nextDouble();
            }

            catch (InputMismatchException ex) {
                System.out.println("Your Enter Input Invalid");
                error = true;
                break;
            }
        }

        if (!error) {
            for (int i = 0; i < 10; i++) {
                System.out.println("----------" + (i+1) + "----------");
                tax(money[i]);
            }
        }
    }
}
