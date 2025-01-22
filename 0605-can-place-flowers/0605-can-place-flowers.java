class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length == 0){ // make sure flowerbed is not empty
            return false;
        }

        int left = 0;
        int right = flowerbed.length - 1;

        int zeroCount = 1;
        int plantPair = 0;

        while(left <= right){

            // empty flowerplot
            if(flowerbed[left] == 0){
                left++;
                zeroCount++;
            } else{
                left++;
                plantPair += (zeroCount - 1) / 2; // calculate number of planted flowers
                zeroCount = 0; // reset zero count 
            }
        }

        if (zeroCount > 0) { // calculate for the trailing zeros at the end that never got reset, if any
            plantPair += zeroCount / 2;
        }

        if (plantPair >= n){
            return true;
        } else{
            return false;
        }
    }
}