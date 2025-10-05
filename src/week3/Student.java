package week3;

class Student {
    private String name;
    private int rollNumber;
    private int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Directly prints details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("Reshma", 1, 100);
        students[1] = new Student("Kowsalya", 2, 100);
        students[2] = new Student("Esther", 3, 100);


        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            students[i].displayDetails();
        }
    }
}
