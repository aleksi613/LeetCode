import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) {
            return 0;
        }

        ArrayList<Double> list = new ArrayList<>();
        int left = 0;
        int right = k;
        double temp = 0;

        for (int i = 0; i < k; i++) {
            temp += nums[i];
        }
        list.add(temp / k); 

        while (right < nums.length) {
            temp = temp - nums[left] + nums[right]; 
            list.add(temp / k); 
            left++;
            right++;
        }

        double maxMean = Collections.max(list);
        return maxMean;
    }
}
