import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number -> its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                // Found the two numbers
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        // As per problem, exactly one solution exists
        throw new IllegalArgumentException("No two sum solution");
    }
}

// Optional main for local testing
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        printResult(sol.twoSum(nums1, target1)); // Output: [0,1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        printResult(sol.twoSum(nums2, target2)); // Output: [1,2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        printResult(sol.twoSum(nums3, target3)); // Output: [0,1]
    }

    private static void printResult(int[] result) {
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
