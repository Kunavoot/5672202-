import java.util.Scanner;

class Shape {
    public void calArea() {
        System.out.println("Result Area: ");
    }
}

public class OtherShape extends Shape{
    public void calArea(int width, int height) {
        System.out.println("Result Rectangle Area: " + (width * height));
    }
    public void calArea(double radius) {
        System.out.println("Result Circle Area: " + (String.format("%.2f",Math.PI*Math.pow(radius, 2))));
    }
    public void calArea(double base, double height) {
        System.out.println("Result Rectangle Area: " + (String.format("%.2f",0.5 * base * height)));
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        OtherShape calShape = new OtherShape();
        System.out.println("Rectangle");
        System.out.print("Please Enter Your Width: ");
        int width4 = sn.nextInt();
        System.out.print("Please Enter Your Height: ");
        int height4 = sn.nextInt();
        calShape.calArea(width4, height4);
        System.out.println("Circle");
        System.out.print("Please Enter Your Radius: ");
        double radius = sn.nextDouble();
        calShape.calArea(radius);
        System.out.println("Triangle");
        System.out.print("Please Enter Your Base: ");
        double base3 = sn.nextDouble();
        System.out.print("Please Enter Your Height: ");
        double height3 = sn.nextDouble();
        calShape.calArea(base3, height3);
    }
}
