package week4.Polymorphism.ShapeAreaCalculator;

class Shape {
    double area(){
        return 0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area() {
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    double length,breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    double area() {
        return length*breadth;
    }
}
class Triangle extends Shape{
    double base,height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    @Override
    double area() {
        return 0.5*base*height;
    }
}
public class Main{
    public static void main(String[] args) {
        Shape[] shapes={new Circle(6),new Rectangle(6,4),new Triangle(5,6)};
        for (Shape s:shapes){
            System.out.println(s.getClass().getSimpleName()+" area : "+s.area());
        }
    }
}