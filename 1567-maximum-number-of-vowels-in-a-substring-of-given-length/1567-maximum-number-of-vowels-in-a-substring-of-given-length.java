class Solution {
    public int maxVowels(String s, int k) {

        int windowVowels = 0;
        int maxVowels = 0;

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for(int i = 0; i < k; i++){

            if(vowels.contains(s.charAt(i))){

                windowVowels++;
                maxVowels = windowVowels;
            }

        }

        for(int i = k; i < s.length(); i++){

            if(vowels.contains(s.charAt(i-k))){
                windowVowels--;
            }

            if(vowels.contains(s.charAt(i))){
                windowVowels++;
            }

            maxVowels = Math.max(maxVowels, windowVowels);

        }

        return maxVowels;
    }
}