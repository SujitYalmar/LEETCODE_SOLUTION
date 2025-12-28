class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }
        long maxScore = Long.MIN_VALUE; 
        long currentPrefixSum = 0;

        for (int i = 0; i < n - 1; i++) {
            currentPrefixSum += nums[i];
            
            int rightSideMin = suffixMin[i + 1];
        
            long currentScore = currentPrefixSum - rightSideMin;
            
            if (currentScore > maxScore) {
                maxScore = currentScore;
            }
        }
        
        return maxScore;
        
        
    }
}