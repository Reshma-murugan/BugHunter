package week4.CopyConstructor.StudentRecord;

class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.marks = s.marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Reshma", 1, 100);

        Student s2 = new Student(s1);

        s2.name = "Kowsalya";
        s2.marks = 90;

        s1.display();
        s2.display();
    }
}

