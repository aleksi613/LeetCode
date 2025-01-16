class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int currentNum = nums[i];

            frequencyMap.put(currentNum, frequencyMap.getOrDefault(currentNum, 0) + 1);

            if (frequencyMap.get(currentNum) > (nums.length / 2)){
                return currentNum;
            }
        }

        return -1;
    }
}