interface StudentData {
    public void data();
}

interface StudentResult {
    public void calGrade();
}

class Student implements StudentData, StudentResult {
    public void data() {
        String name = "Somsak kuamlao";
        String major = "Software Engineer";
        System.out.println("Student Name is " + name);
        System.out.println("Student Major is " + major);
    }

    public void calGrade() {
        int score = 78;
        if (score < 50) {
            System.out.println("Student Grade is F");
        }
        else if (score < 60) {
            System.out.println("Student Grade is D");
        }
        else if (score < 70) {
            System.out.println("Student Grade is C");
        }
        else if (score < 80) {
            System.out.println("Student Grade is B");
        }
        else if (score < 101) {
            System.out.println("Student Grade is A");
        }
        else {
            System.out.println("Error Calculate Grade!!!");
        }
    }
}

public class Mymain {
    public static void main(String[] args) {
        Student std = new Student();
        std.data();
        std.calGrade();
    }

}
