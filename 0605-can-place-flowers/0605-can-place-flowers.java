class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length == 0){
            return false;
        }

        int left = 0;
        int right = flowerbed.length - 1;

        int zeroCount = 1;
        int pair = 0;

        while(left <= right){

            if(flowerbed[left] == 0){
                left++;
                zeroCount++;
            } else{
                left++;
                pair += (zeroCount - 1) / 2;
                zeroCount = 0;
            }
        }

        if (zeroCount > 0) {
            pair += zeroCount / 2;
        }

        if (pair >= n){
            return true;
        } else{
            return false;
        }
    }
}