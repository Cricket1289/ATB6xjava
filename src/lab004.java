import java.util.Scanner;

public class lab004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("enter num 1");
        int num2 = sc.nextInt();
        System.out.println("enter num 2");
        if (num1 > num2) {
            System.out.println("num1 is max"+ num1);
        } else {
            System.out.println("num2 is max"+ num2);
        }
    }
}



