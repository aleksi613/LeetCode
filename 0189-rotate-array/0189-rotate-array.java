class Solution {
    public void rotate(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        if(k == 0){
            return;
        }

        for(int i = 0; i < nums.length; i++){
            deque.addLast(nums[i]);
        }

        for(int i = 0; i < k; i++){
            int last = deque.removeLast();
            deque.addFirst(last);
        }

        int index = 0;

        for(int value : deque){
            nums[index++] = value;
        }

    }
}