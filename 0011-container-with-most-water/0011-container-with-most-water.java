class Solution {
    public int maxArea(int[] height) {

        int currentArea = 0;
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){

            currentArea = (Math.min(height[left], height[right]) * (right - left));
            maxArea = Math.max(currentArea, maxArea);

            if(height[left] > height[right]){
                right--;
            } else if (height[left] < height[right]){
                left++;
            } else {
                left++;
                right--;
            }

        }

        return maxArea;
    }
}