package week3;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public int area(){
       return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    public static void main(String[]args){
        Rectangle r1=new Rectangle(5,4);

        Rectangle r2=new Rectangle(6,5);

        System.out.println("rectangle1 - area : "+r1.area());
        System.out.println("rectangle1 - perimeter : "+r1.perimeter());

        System.out.println("rectangle2 - area : "+r2.area());
        System.out.println("rectangle2 - perimeter : "+r2.perimeter());
    }
}
