public class Linear {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9};
        int target=7;
        int ans=linearsearch(arr,target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(target==element){
                return i;
            }
        }
        return -1;
    }

}