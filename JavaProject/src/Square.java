import java.util.Scanner;

public class Square {
    int width;
    int length;
    Scanner sn = new Scanner(System.in);

    public void squareArea() {
        System.out.println("----- Square Area -----");
        System.out.print("Please Enter Width : ");
        width = sn.nextInt();
        System.out.print("Please Enter Length : ");
        length = sn.nextInt();
        System.out.println("Your Square Area : "+ (width * length));
    }

    public void squareCircumArea() {
        System.out.println("----- Square Circum Area -----");
        System.out.print("Please Enter Width : ");
        width = sn.nextInt();
        System.out.print("Please Enter Length : ");
        length = sn.nextInt();
        System.out.println("Your Square Circum Area : "+ (width * 2 + length * 2));
    }

    public static void main(String[] args) {
        Square mySquare = new Square();
        mySquare.squareArea();
        mySquare.squareCircumArea();
    }
}
