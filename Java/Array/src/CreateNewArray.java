import java.util.Arrays;

public class CreateNewArray {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] a=getconcatenation(nums);
        System.out.println(Arrays.toString(a));

    }
    public static int[] getconcatenation(int[] nums){
        int n=nums.length;
        int[] ans=new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
