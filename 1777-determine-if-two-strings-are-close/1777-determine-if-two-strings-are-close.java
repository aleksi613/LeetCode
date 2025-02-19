class Solution {
    public boolean closeStrings(String word1, String word2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if(word1.length() != word2.length()){
            return false;
        }

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        for(char c : charArray1){
            map1.put(c, map1.getOrDefault(c, 0) + 1); 
        }

        for(char c : charArray2){
            map2.put(c, map2.getOrDefault(c, 0) + 1); 
        }

        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }

        // check if freq distribution is the same
        List<Integer> list1 = new ArrayList<>(map1.values());
        List<Integer> list2 = new ArrayList<>(map2.values());

        Collections.sort(list1);
        Collections.sort(list2);

        if(list1.equals(list2)){
            return true;
        } else{
            return false;
        }

    }
}