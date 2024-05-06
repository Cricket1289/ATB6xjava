public class lab26 {
    public static void main(String[] args) {
        int [] array = {20,23,30};
        int [] array2 = new int[3];
        for (int i=0;i<array.length;i++){
           array2[i] = array[i]*2;
        }
        for (int i=0;i<array2.length;i++) {
            System.out.println(array2[i]);
        }
    }
}
