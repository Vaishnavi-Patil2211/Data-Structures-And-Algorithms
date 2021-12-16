public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, -455, 56, 65, 5, 43,};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];


            }

        }
        return ans;
    }
    static int max(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];


            }

        }
        return ans;
    }


}