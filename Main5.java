import java.util.Arrays;

public class Main5
 {
    public static void rotateArrayInPlace(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        
        // Handle cases where k is larger than the array length
        k = k % n; 

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the rest
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse elements between two indices
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArrayInPlace(nums, k);

        // Expected Output: [5, 6, 7, 1, 2, 3, 4]
        System.out.println(Arrays.toString(nums));
    }
}
