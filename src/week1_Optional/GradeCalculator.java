package week1_Optional;

public class GradeCalculator {
    public static void main(String[] args) {
        /* 90 or above → Grade A
           75 to 89    → Grade B
           50 to 74    → Grade C
           Below 50    → Fail */

        int mark = 100;

        if (mark >= 90) {
            System.out.println("Grade : A");
        } else if (mark >= 75) { // 75–89
            System.out.println("Grade : B");
        } else if (mark >= 50) { // 50–74
            System.out.println("Grade : C");
        } else {
            System.out.println("Fail");
        }
    }
}
