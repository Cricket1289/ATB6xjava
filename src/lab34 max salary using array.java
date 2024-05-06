public class lab34 {
    public static void main(String[] args) {
        int [] salaries = {34,45,35,37};
        int max_salary = Integer.MIN_VALUE;
        for (int i=0;i<salaries.length;i++) {
            if (salaries[i] > max_salary) {
                max_salary = salaries[i];
            }
        }
        System.out.println("max salary is "+max_salary);

    }
}
