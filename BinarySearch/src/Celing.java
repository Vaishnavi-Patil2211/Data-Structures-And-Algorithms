public class Celing {

        public static void main(String[] args) {
            int[] arr = {2,4,6,8,10,12,14,16,18,20};
            int target = 11;
            int ans = binarysearch(arr,1 target);
            System.out.println(ans);
        }
        static int binarysearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end- start) / 2;
                if (arr[mid] == target) {
                    return mid;

                }
                if (arr[mid] < target) {
                    start = mid + 1;

                }
                if (arr[mid] > target) {
                    end = mid - 1;
                }

            }
            return start;
        }
    }




