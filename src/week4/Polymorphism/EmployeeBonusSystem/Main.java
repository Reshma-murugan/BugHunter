package week4.Polymorphism.EmployeeBonusSystem;

class Employee{
    int Salary;
    Employee(int s){
        Salary=s;
    }
    double getBonus(){
        return 0;
    }
}
class Manager extends Employee{

    Manager(int s) {
        super(s);
    }

    @Override
    double getBonus() {
        return 0.2*Salary;
    }
}
class Developer extends Employee{

    Developer(int s) {
        super(s);
    }
    @Override
    double getBonus() {
        return 0.1*Salary;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee[] employees={new Manager(50000),new Developer(40000)};
        for (Employee e:employees){
            System.out.println("Bonus for "+e.getClass().getSimpleName()+" "+e.getBonus());
        }
    }
}
