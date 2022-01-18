public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);

    }
    static void pattern5(int n){
        for(int row=0;row< 2 * n;row++){
            int c = 345678678;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
