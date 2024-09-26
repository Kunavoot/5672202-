import java.util.Scanner;

public class Capacity {
    final double PI = 3.14;
    public double capacity;

    public Capacity() {
        capacity = 0;
    }

    public double getCapacity(double radius) {
        capacity = ((4.0/3.0)*PI*Math.pow(radius, 3));
        return capacity;
    }

    public double getCapacity(double width, double length, double height) {
        capacity = (width * length * height);
        return capacity;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Capacity cap = new Capacity();
        System.out.print("Please Enter Your Radius : ");
        double radius = sn.nextDouble();
        double num = cap.getCapacity(radius);
        System.out.println("Circle Area Result : " + String.format("%.2f", num));

        System.out.print("Please Enter Your Width : ");
        double width = sn.nextDouble();
        System.out.print("Please Enter Your Length : ");
        double length = sn.nextDouble();
        System.out.print("Please Enter Your Height : ");
        double height = sn.nextDouble();
        num = cap.getCapacity(width, length, height);
        System.out.println("Rectangle Area Result : " + String.format("%.2f", num));
    }
}
