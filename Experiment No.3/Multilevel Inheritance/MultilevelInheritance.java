import java.util.Scanner;


class Student {
    int roll_no;

    void getRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    void displayRollNo() {
        System.out.println("Roll Number: " + roll_no);
    }
}


class Test extends Student {
    int sub1, sub2;

    void getMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void displayMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + (total / 2.0));
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result student = new Result();

        
        System.out.print("Enter Roll Number: ");
        int roll_no = sc.nextInt();
        student.getRollNo(roll_no);

        System.out.print("Enter Marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        int sub2 = sc.nextInt();

        student.getMarks(sub1, sub2);

        
        System.out.println("\nStudent Result:");
        student.displayRollNo();
        student.displayMarks();
        student.displayResult();

        sc.close();
    }
}
