public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        n=2*n;
        for(int row=0; row <= n; row++){
            for(int col =0 ; col<= n; col++){
                int ateveryindex = math.min(math.min(row,col), math.min(n-row,n-col));
                System.out.println(ateveryindex+" ");
            }
            System.out.println();
        }
    }
}
