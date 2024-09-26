import java.util.*;
//import java.util.Collections;

public class Excerzises2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] num = new int[10];
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number " + (i+1) + " : " );
            num[i] = sn.nextInt();
        }
        for (int x = 0; x < 10; x++) {
            for (int y = x + 1; y < 10; y++) {
                if (num[x] > num[y]) {
                    temp = num[x];
                    num[x] = num[y];
                    num[y] = temp;
                }
            }
        }
        for (int j : num) {
            System.out.print(j + " ");
        }
    }
}

//public class Excerzises2 {
//    public static void main(String[] args) {
//        Scanner sn = new Scanner(System.in);
//        ArrayList<Integer> num = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter Number " + (i+1) + " : " );
//            num.add(i, sn.nextInt());
//        }
//        Collections.sort(num);
//        for (int j : num) {
//            System.out.print(j + " ");
//        }
//    }
//}
