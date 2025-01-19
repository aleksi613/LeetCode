class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()){
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int i = 0;
        int j = 0;

        while (i < sArray.length && j < tArray.length){

            if(sArray[i] == tArray[j]){
                i++;
                j++;
            } else {
                j++;
            }

        }

        if(i == sArray.length){
            return true;
        } else 
        {
            return false;
        }
    }
}