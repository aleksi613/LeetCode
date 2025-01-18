class Solution {
    public String reverseWords(String s) {
        String[] reverseStr = s.trim().split("\\s+");

        int start = 0;

        int end = reverseStr.length - 1;

        while (start < end){
            String temp = reverseStr[start];

            reverseStr[start] = reverseStr[end];

            reverseStr[end] = temp;

            start++;

            end--;

        }

        return String.join(" ", reverseStr);
    }
}