class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
    double maxSum = 0, windowSum = 0;

    for(int i = 0; i < k; i++){
        windowSum += nums[i];
    }

    maxSum = windowSum;

    for(int i = k; i < nums.length; i++){

        windowSum = windowSum - nums[i-k] + nums[i];

        maxSum = Math.max(windowSum, maxSum);
    }

    return maxSum / k;

    }

}
