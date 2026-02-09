import java.util.Scanner;

// Blueprints for the student
class StudentInfo {
    private String name;
    private int rollNo;
    private double[] marks;

    public StudentInfo(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public double calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }

    public char getGrade(double average) {
        if (average >= 80) return 'A';
        else if (average >= 60) return 'B';
        else if (average >= 40) return 'C';
        else return 'F';
    }

    public void displayResult() {
        double avg = calculateAverage();
        System.out.println("\n--- Student Marksheet ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average: " + avg + "%");
        System.out.println("Grade: " + getGrade(avg));
    }
}

public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        double[] marks = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
        }

        // Fixed the name here to match 'StudentInfo'
        StudentInfo studentObj = new StudentInfo(name, roll, marks);
        studentObj.displayResult();

        sc.close();
    }
}