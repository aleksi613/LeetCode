class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(map.values());

        for(int i = 0; i < frequencies.size(); i++){
            int freq = frequencies.get(i);
            if(!set.add(freq)){
                return false;
            }
        }

        return true;

    }
}