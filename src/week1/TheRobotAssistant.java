package week1;

public class TheRobotAssistant {
    public static void main(String[] args) {
        int a = 6 , b = 7 ;
        int op = 3 ;
        int c = switch (op) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> 0;
        };
        System.out.println(c);
    }
}
