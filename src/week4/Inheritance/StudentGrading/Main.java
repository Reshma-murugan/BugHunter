package week4.Inheritance.StudentGrading;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    void DisplayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    int marks;
    char grade;
    Student(String name, int age ,int marks,char grade) {
        super(name, age);
        this.marks=marks;
        this.grade=grade;
    }

    @Override
    void DisplayDetails() {
        super.DisplayDetails();
        System.out.println("Marks : "+marks);
        System.out.println("Grade : "+grade);
    }
}
class GraduateStudent extends Student{
    String researchTopic;
    GraduateStudent(String name, int age, int marks, char grade ,String researchTopic) {
        super(name, age, marks, grade );
        this.researchTopic=researchTopic;
    }

    @Override
    void DisplayDetails() {
        super.DisplayDetails();
        System.out.println("researchTopic : "+researchTopic);
    }
}
public class Main {
    public static void main(String[] args) {
        Person[] persons={
                new Person("Reshma",20),
                new Student("Kowsalya",20,100,'A'),
                new GraduateStudent("Esther",21,100,'A',"AI")
        };
        for (Person p:persons){
            p.DisplayDetails();
            System.out.println("----------------");
        }
    }
}
