class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] result = new Boolean[candies.length];

        int maxCandy = 0;

        for(int j = 0; j < candies.length; j++){
            if(candies[j] > maxCandy){
                maxCandy = candies[j];
            }
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= maxCandy){
                result[i] = true;
            } else{
                result[i] = false;
            }
        }

        List<Boolean> resultList = new ArrayList<>();

        for(int i = 0; i < result.length; i++){
            resultList.add(result[i]);
        }

        return resultList;
    }
}