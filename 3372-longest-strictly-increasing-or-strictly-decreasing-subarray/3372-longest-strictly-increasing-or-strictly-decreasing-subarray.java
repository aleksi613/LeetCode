class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int maxCount = 1;
        int increaseCount = 1, decreaseCount = 1;
        
        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i] > nums[i+1]){
                decreaseCount++;
                increaseCount = 1;

            } else if (nums[i] < nums[i+1]){
                increaseCount++;
                decreaseCount = 1;
            } else {
                increaseCount = 1;
                decreaseCount = 1;
            }  

            maxCount = Math.max(maxCount, Math.max(increaseCount, decreaseCount));
        }

        return maxCount;
    }
}