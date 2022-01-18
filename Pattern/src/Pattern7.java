public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);

    }
    static void pattern7(int n){
        for(int row=0;row<2*n;row++){
            int totalcolsinrow=row>n?2*n-row:row;
            int noofspaces=n- totalcolsinrow;
            for(int s=0;s<noofspaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalcolsinrow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
