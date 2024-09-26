import java.util.*;

public class TemCalculate {
    public static double temChange(double Celsius) {
        double Fahrenheit = (Celsius * 1.8) + 32;
        return Fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double []C = new double[10];
        double []F = new double[10];
        boolean error = false;
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " : Please Enter Your Degree Celsius : ");
            try {
                C[i] = sn.nextDouble();
                F[i] = temChange(C[i]);
            }
            catch (InputMismatchException ex) {
                System.out.println("Your Enter Input Invalid");
                error = true;
                break;
            }
        }
        if (!error) {
            double temp = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = i + 1; j < 10; j++) {
                    if (F[i] > F[j]) {
                        temp = F[i];
                        F[i] = F[j];
                        F[j] = temp;
                    }
                    if (C[i] > C[j]) {
                        temp = C[i];
                        C[i] = C[j];
                        C[j] = temp;
                    }
                }
            }
            System.out.println("Minimum Your Degree : " + String.format("%.2f", C[0]) + " °C, " + String.format("%.2f", F[0]) + " °F");
            System.out.println("Maximum Your Degree : " + String.format("%.2f", C[9]) + " °C, " + String.format("%.2f", F[9]) + " °F");
        }
    }
}
