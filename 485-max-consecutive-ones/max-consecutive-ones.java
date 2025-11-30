public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;  // Maximum consecutive 1s
        int count = 0;     // Current consecutive 1s
        
        for (int num : nums) {
            if (num == 1) {
                count++;               // 1 milne par current streak increment
                maxCount = Math.max(maxCount, count); // Update max if needed
            } else {
                count = 0;             // 0 milne par streak reset
            }
        }
        
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums1)); // 3
        System.out.println(findMaxConsecutiveOnes(nums2)); // 2
    }
}
