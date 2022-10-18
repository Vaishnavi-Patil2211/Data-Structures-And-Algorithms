public class FindLastIndex {
    public static void main(String[] args) {
        int[] arr={23,45,6,78,90};
        System.out.println(findlastindex(arr, 78,arr.length-1));
    }
     static int findlastindex(int[] arr,int target,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findlastindex(arr,target,index-1);
        }
     }
}
