package week4.CopyConstructor.PointClass;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 10);

        Point p2 = new Point(p1);
        Point p3 = new Point(p1);

        p2.x = 20;
        p3.y = 30;

        p1.display();
        p2.display();
        p3.display();
    }
}

