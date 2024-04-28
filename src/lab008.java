import java.util.Scanner;

public class lab008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side 1,side 2,side 3, i will tell triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if((side1 == side2) && (side2 == side3) && (side3 == side1) ){
            System.out.println("EQU");
        }else if((side1 == side2) || (side2 == side3) || (side3 == side1)){
            System.out.println("ISO");
        }else{
            System.out.println("sca");
        }

    }
}
