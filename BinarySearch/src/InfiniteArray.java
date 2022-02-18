public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){

        int start=0;
        int end=0;
        while(target>arr[end]){
            int temp=end+1;

            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
