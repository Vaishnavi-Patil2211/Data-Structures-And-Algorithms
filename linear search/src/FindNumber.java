public class FindNumber {
    public static void main(String[] args) {
        int[] nums={12,23,34,45,56,67,78,89};
        int target=45;
        int ans=linearsearch(nums,target);
        System.out.println(ans);

    }

    //search in the array:return the index if items found
    //otherwise the item not found return -1
    static int linearsearch(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }

        //run a for loop
        for(int i =0; i<arr.length;i++){
        //check for element at every index if it is = target
        int element = arr[i];
        if(element== target){
            return i;
        }
        }
        //this line will exicute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}
