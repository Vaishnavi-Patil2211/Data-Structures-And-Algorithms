public class FindNumber {
    public static void main(String[] args) {
        int[] nums = {12, 23, 34, 45, 56, 67, 78, 89};
        int target = 45;
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // Search in the array: return true if the item is found, otherwise return false
    static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        // If the loop completes without finding the target, return false
        return false;
    }
}

