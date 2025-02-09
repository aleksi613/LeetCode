class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            map.put(nums[i], i);

        }

        for(int j = 0; j < nums.length; j++){

            int complement = target - nums[j];

            if(map.containsKey(complement) && map.get(complement) != j){
                return new int[]{map.get(complement), j};
            }
        }

        return new int[]{};

    }

}
