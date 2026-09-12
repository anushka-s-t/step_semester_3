import java.util.Arrays;

public class Main {
    // Your twoSum method
    static int[] twoSum(int[] nums, int target) { 
        for (int i = 0; i < nums.length; i++) { 
            for (int j = i + 1; j < nums.length; j++) { 
                if (nums[i] + nums[j] == target) { 
                    return new int[]{i, j}; 
                } 
            } 
        } 
        return new int[]{-1, -1}; 
    } 

    // The main method to execute and test your code
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        
        // Prints the resulting indices [0, 1]
        System.out.println(Arrays.toString(result)); 
    }
}
