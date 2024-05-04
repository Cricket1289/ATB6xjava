public class lab25 {
    public static void main(String[] args) {
        int [] salaries = {23,34,36,54,14,49,498};
        int max_salary = Integer.MIN_VALUE;
        for (int i=0;i<salaries.length;i++){
            if (salaries[i] > max_salary){
                max_salary = salaries[i];
            }
        }
        System.out.println("max value is "+ max_salary);
    }
}

