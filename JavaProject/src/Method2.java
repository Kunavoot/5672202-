import  java.lang.*;

public class Method2 {
//    public static double volume(double r) {
//        return (4.0 / 3.0 * Math.PI * Math.pow(r, 3));
//    }
//
//    public static double volume(double w, double h, double l) {
//        return w * h * l;
//    }

    public static void volume(double r) {
        System.out.println("Circle Volume : " + String.format("%.2f",(4.0 / 3.0 * Math.PI * Math.pow(r, 3))));
    }

    public static void volume(double w, double h, double l) {
        System.out.println("Rectangle Volume : " + String.format("%.2f",w * h * l));
    }

    public static void main(String[] args) {
        double r = 7.8, w = 10.7, l = 3.3, h = 6.7;
        volume(r);
        volume(w, h, l);
//        System.out.println("Circle Volume : " + volume(r));
//        System.out.println("Rectangle Volume : " + volume(w,h,l));
    }
}
