package week3;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Reshma");
        e1.setId(1);
        e1.setSalary(50000);

        e1.displayEmployee();
    }
}
