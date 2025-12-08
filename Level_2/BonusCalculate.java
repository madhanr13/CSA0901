import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    private int experience;

    Employee(String name, double salary, int experience) {
        if (salary <= 0) throw new IllegalArgumentException("Invalid salary.");
        if (experience < 0) throw new IllegalArgumentException("Invalid experience.");

        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    double calculateBonus() {
        double rate;

        if (experience < 3) rate = 0.05;
        else if (experience <= 6) rate = 0.10;
        else rate = 0.15;

        return salary * rate;
    }

    void printDetails() {
        System.out.println("\n--- Employee Bonus ---");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Bonus: " + calculateBonus());
    }
}

public class BonusCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of experience: ");
        int exp = sc.nextInt();

        Employee emp = new Employee(name, salary, exp);
        emp.printDetails();
    }
}
