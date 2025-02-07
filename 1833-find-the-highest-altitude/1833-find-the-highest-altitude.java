class Solution {
    public int largestAltitude(int[] gain) {

        int maxAlt = 0;

        int altitude = 0;

        for (int i = 0; i < gain.length; i++){
            
            altitude += gain[i];
            
            if(altitude > maxAlt){
                maxAlt = altitude;
            }
        }

        return maxAlt;
    }
}