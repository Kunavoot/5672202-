import java.util.*;
//import java.util.ArrayList;

public class Excerzises1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int []num = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number " + (i+1) + " : " );
            num[i] = sn.nextInt();
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("Maximum Value : " + max);
    }
}

//public class Excerzises1 {
//    public static void main(String[] args) {
//        Scanner sn = new Scanner(System.in);
//        ArrayList<Integer> num = new ArrayList<Integer>();
//        int max = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter Number " + (i+1) + " : " );
//            num.add(i, sn.nextInt());
////            System.out.println(num.get(i));
//            if (max < num.get(i)) {
//                max = num.get(i);
//            }
//        }
//        System.out.println("Maximum Value : " + max);
//    }
//}
