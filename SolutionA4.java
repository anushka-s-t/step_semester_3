import java.util.HashMap;

public class SolutionA4 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        // Base case: An empty prefix has a sum of 0, appearing once
        prefixSumMap.put(0, 1);
        
        for (int num : nums) {
            currentSum += num;
            
            // Check if there is a complementary prefix sum that yields sum == k
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }
            
            // Record the current prefix sum in the frequency map
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}
