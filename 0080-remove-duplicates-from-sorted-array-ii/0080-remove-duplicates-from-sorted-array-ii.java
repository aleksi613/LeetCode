class Solution {
    public int removeDuplicates(int[] nums) {

    if (nums.length <= 1){
        return nums.length;
    }
    
        int k = 0;

        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i] != nums[i+2]){
                nums[k] = nums[i];
                k++;

            }
        }

        nums[k] = nums[nums.length - 2];
        k++;

        nums[k] = nums[nums.length - 1];
        k++;

        return k;

    }
}