public class FindIndex {
    public static void main(String[] args) {
        int[] arr ={2,44,65,76,87,90};
        System.out.println(findindex(arr, 87 ,0));
    }
    static int findindex(int[] arr ,int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findindex(arr,target,index+1);
        }
    }
}
