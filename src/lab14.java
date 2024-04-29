import java.util.Scanner;

public class lab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int ab2 = sc.nextInt();
        System.out.println("enter num2");
        int ab1 = sc.nextInt();
        System.out.println("enter operation, +,-,%,/,*");
        Character operator = sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println("result = "+ (ab2 + ab1));
                break;
            case '-':
                System.out.println("result = "+ (ab2 - ab1));
                break;
            case '%':
                System.out.println("result = "+ (ab1 % ab2));
                break;
            case '/':
                System.out.println("result = "+ (ab1 / ab2));
                break;
            case '*':
                System.out.println("result = "+ (ab1 * ab2));
                break;

        }
    }
}
