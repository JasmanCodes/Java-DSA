package Searching_Algorithms;

public class BS_Que_3 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target));  // Should print index of 0
    }

    static int search(int[] nums, int target) {
        int pivot = findpivotwithduplicates(nums);

        if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }
//
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findpivotwithduplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Case 4: left is sorted
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }

            // Case 5: pivot is on the left
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
