class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if (word1.length() != word2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        boolean[] exists1 = new boolean[26];
        boolean[] exists2 = new boolean[26];

        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
            exists1[c - 'a'] = true;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
            exists2[c - 'a'] = true;
        }

        if (!Arrays.equals(exists1, exists2)) return false;

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}