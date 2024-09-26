import java.util.InputMismatchException;
import java.util.Scanner;

public class Student2 {
    int stuId;
    String stuName;
    int stuHomework;
    int stuTest;
    int stuMidterm;
    int stuFinal;

    public void gradeCalculate(int result) {
         if (result < 50) {
             System.out.println("Grade F");
         }
         else if (result < 60) {
             System.out.println("Grade D");
         }
         else if (result < 70) {
             System.out.println("Grade C");
         }
         else if (result < 80) {
             System.out.println("Grade B");
         }
         else {
             System.out.println("Grade A");
         }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Student2 myStudent = new Student2();
        try {
            System.out.print("Enter Student ID : ");
            myStudent.stuId = sn.nextInt();
            System.out.print("Enter Student Name : ");
            myStudent.stuName = sn.next();
            System.out.print("Enter Student Score Homework : ");
            myStudent.stuHomework = sn.nextInt();
            System.out.print("Enter Student Score Test : ");
            myStudent.stuTest = sn.nextInt();
            System.out.print("Enter Student Score MidTerm : ");
            myStudent.stuMidterm = sn.nextInt();
            System.out.print("Enter Student Score Final : ");
            myStudent.stuFinal = sn.nextInt();
            int score = myStudent.stuHomework + myStudent.stuTest + myStudent.stuMidterm + myStudent.stuFinal;
            System.out.println("------------------------------");
            System.out.print(myStudent.stuId + " " + myStudent.stuName + " : ");
            myStudent.gradeCalculate(score);
        }
        catch (InputMismatchException e) {
            System.out.println("Input Error !!!");
        }
    }
}
