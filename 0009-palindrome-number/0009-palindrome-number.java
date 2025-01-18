class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0){
            return false;
        }
        Boolean result;

        String numStr = Integer.toString(x);

        int[] palindrome = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++){
            palindrome[i] = numStr.charAt(i) - '0';
        }

        int[] reversePalindrome = Arrays.copyOf(palindrome, palindrome.length);

        for (int j = 0; j < reversePalindrome.length / 2; j++) {
            int temp = reversePalindrome[j];
            reversePalindrome[j] = reversePalindrome[reversePalindrome.length - 1 - j];
            reversePalindrome[reversePalindrome.length - 1 - j] = temp;
        }

        
        if (Arrays.equals(palindrome, reversePalindrome)){
            result = true;
        } else{
            result = false;
        }

        return result;
    }

}