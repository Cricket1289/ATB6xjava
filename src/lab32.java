import java.util.Scanner;

public class lab32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<=100;i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else {
                System.out.println("not a value of 3 and 5");
            }
        }
    }
}
