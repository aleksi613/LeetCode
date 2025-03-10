class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            set2.add(num);
        }

        for(int num : set1){
            if(!set2.contains(num)){
                list1.add(num);
            }
        }

        for(int num : set2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }

        return Arrays.asList(list1, list2);




    }
}