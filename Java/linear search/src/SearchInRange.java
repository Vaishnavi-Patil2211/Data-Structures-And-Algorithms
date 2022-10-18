public class SearchInRange{
    public static void main(String[] args) {
        int[] arr={12,23,34,45,56,67,78,89};
        int target=12;
        System.out.println(linearsearch(arr,target,1,4));
    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }


        for(int i =start; i<=end;i++){
            //check for element at every index if it is = target
            int element = arr[i];
            if(element== target){
                return i;
            }
        }

        return -1;
    }
}
