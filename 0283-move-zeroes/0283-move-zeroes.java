class Solution {
    public void moveZeroes(int[] nums) {

        if(nums.length <= 1){
            return;
        }

        Deque<Integer> dequeNums = new ArrayDeque<>();

        Deque<Integer> dequeZeros = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                dequeNums.addLast(nums[i]);
            } else{
                dequeZeros.addFirst(nums[i]);
            }
        }
        
        dequeNums.addAll(dequeZeros);

        Integer[] tempArray = dequeNums.toArray(new Integer[0]);

        for(int k = 0; k < tempArray.length; k++){
            nums[k] = tempArray[k];
        }

    }
}