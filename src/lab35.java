public class lab35 {
    public static void main(String[] args) {
        int[] abhi = {24, 33, 34};
        int[] abhi2 = new int[3];
        for (int i = 0; i < abhi.length; i++) {
            abhi2[i] = abhi[i] * 2;
        }
        for (int i = 0; i < abhi2.length; i++) {
            System.out.println(abhi2[i]);
        }
    }
}
