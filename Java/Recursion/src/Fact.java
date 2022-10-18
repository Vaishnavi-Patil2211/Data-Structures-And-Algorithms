public class Fact {
    public static void main(String[] args) {
        int ans = Fact(5);
        System.out.println(ans);
    }
    static int Fact(int n){
        if (n<=1){
            return 1;
        }
        return n * Fact(n-1);
    }
}
