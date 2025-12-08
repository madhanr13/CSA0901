import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    int getTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    double getAverage() {
        return (double) getTotal() / marks.length;
    }

    char getGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

    void printResult() {
        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + getTotal());
        System.out.println("Average: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }
}

public class StudentAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m < 0 || m > 100) {
                System.out.println("Invalid mark. 0–100 only.");
                return;
            }
            marks[i] = m;
        }

        Student s = new Student(name, marks);
        s.printResult();
    }
}
