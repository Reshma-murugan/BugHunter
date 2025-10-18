package week5.StudentReportSystem.report;

import week5.StudentReportSystem.student.Address;
import week5.StudentReportSystem.student.Student;

import java.util.Scanner;


public class ReportGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number:");
        int rollNo = sc.nextInt();

        System.out.println("Enter Marks:");
        double marks = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Enter City:");
        String city = sc.nextLine();

        System.out.println("Enter State:");
        String state = sc.nextLine();

        Address address = new Address(city, state);
        Student student = new Student(name, rollNo, marks, address);

        student.displayStudentDetails();

        sc.close();
    }
}

