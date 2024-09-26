import java.util.*;

public class TestIf3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please Enter Number 1-100 : ");
        int marks = sn.nextInt();
        if (marks >= 1 && marks <= 100) {
            if (marks < 50) {
                System.out.println("Fail");
            }
            else if (marks < 60) {
                System.out.println("Grade D");
            }
            else if (marks < 70) {
                System.out.println("Grade C");
            }
            else if (marks < 80) {
                System.out.println("Grade B");
            }
            else if (marks < 90) {
                System.out.println("Grade A");
            }
            else   {
                System.out.println("Grade A+");
            }
//            else if (marks < 100) {
//                System.out.println("Grade A+");
//            }
        }
//            if (marks < 1) {
//                System.out.println("Invalid Number");
//            }
//            else {
//                System.out.println("Invalid Number");
//            }
        }
    }

