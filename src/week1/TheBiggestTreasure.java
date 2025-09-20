package week1;

public class TheBiggestTreasure {
    public static void main(String[] args) {
        int a=100,b=50,c=75;
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if (b>=a && b>=c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}

