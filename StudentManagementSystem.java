import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Management System ===");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Department: ");
        String department = sc.next();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Student ID : " + id);
        System.out.println("Department : " + department);

        System.out.println("\nStudent added successfully!");

        sc.close();
    }
}