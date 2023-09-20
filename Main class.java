
package main;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Person[] people = new Person[2];
        people[0] = new Student("", "", 0);
        people[1] = new Faculty("", "", 0.0);

        for (Person person : people) {
            person.getData();
            person.display();
        }
    }
}

abstract class Person {
    protected String name;
    protected String aadharNumber;

    public Person() {
        // Default constructor
    }

    public Person(String name, String aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
    }

    abstract void getData();

    abstract void display();
}

class Student extends Person {
    private int marks;

    public Student(String name, String aadharNumber, int marks) {
        super(name, aadharNumber);
        this.marks = marks;
    }

    @Override
    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Details:");
        System.out.print("StudentName: ");
        name = scanner.nextLine();
        System.out.print("StudentAadhar Number: ");
        aadharNumber = scanner.nextLine();
        System.out.print("Marks for 5 subjects: ");
        marks = scanner.nextInt();
    }

    @Override
    void display() {
        System.out.println("Student Details:");
        System.out.println("studentName: " + name);
        System.out.println("studentAadhar Number: " + aadharNumber);
        System.out.println("studentMarks for 5 subjects: " + marks);
    }
}

class Faculty extends Person {
    private double salary;

    public Faculty(String name, String aadharNumber, double salary) {
        super(name, aadharNumber);
        this.salary = salary;
    }

    @Override
    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Faculty Details:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Aadhar Number: ");
        aadharNumber = scanner.nextLine();
        System.out.print("Salary: ");
        salary = scanner.nextDouble();
    }

    @Override
    void display() {
        System.out.println("Faculty Details:");
        System.out.println("FacultyName: " + name);
        System.out.println("FacutlyAadhar Number: " + aadharNumber);
        System.out.println("FacutlySalary: " + salary);
    }
}

