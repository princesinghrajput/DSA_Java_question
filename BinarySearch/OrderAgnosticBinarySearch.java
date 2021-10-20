public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 5, 6, 7, 8,};
        int arr[]={5,6,7,8,9,12,34,56};
        int target = 56;
        int ans = oabs(arr, target);
        System.out.println(ans);
    }


    static int oabs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }


        }
        return -1;

    }
}


