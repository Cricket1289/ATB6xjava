import java.util.Scanner;

public class lab22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("temperature converter");
        System.out.println("1.celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to celsius");
        System.out.println("Enter your choice 1 or 2");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("celsius to Fahrenheit");
                break;
            case 2 :
                System.out.println("Fahrenheit to celsius");
                break;
            default:
                System.out.println("invalid");
        }

        sc.close();

        }
}
