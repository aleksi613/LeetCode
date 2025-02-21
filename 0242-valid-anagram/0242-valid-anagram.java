class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int num : s.toCharArray()){
            map1.put(num, map1.getOrDefault(num, 0)+1);
        }

        for(int num : t.toCharArray()){
            map2.put(num, map2.getOrDefault(num, 0)+1);
        }

        return map1.equals(map2);

    }
}