public class lab27 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {23,1,2},
                {12,34,22},
                {4,56,79}
        };
        for (int i=0;i<array_2d.length;i++){
            for (int j=0;j< array_2d[i].length;j++){
                System.out.println(array_2d[i][j]);
            }
        }
    }
}
