import java.util.Scanner;

public class lab33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[5];
        System.out.println("enter sub 1 marks");
        marks[0] = sc.nextInt();
        System.out.println("enter sub 2 marks");
        marks[1] = sc.nextInt();
        System.out.println("enter sub 3 marks");
        marks[2] = sc.nextInt();
        System.out.println("enter sub 4 marks");
        marks[3] = sc.nextInt();
        System.out.println("enter sub 5 marks");
        marks[4] = sc.nextInt();
        for (int i=0;i<marks.length;i++){
            if (marks[i]>35){
                System.out.println("passed");
            }else
            System.out.println("failed");
        }
    }
}
