public class SmallestLetters {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target ='k';
        char ans = nextgreatestletter(letters,target);
        System.out.println(ans);
    }
    public static char nextgreatestletter(char[] letters, char target){
        int start =0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
