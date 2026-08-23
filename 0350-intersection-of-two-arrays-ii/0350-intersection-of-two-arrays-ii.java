class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        
      
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

       
        List<Integer> res = new ArrayList<>();
        for (int num : nums2) {
            if (map1.containsKey(num) && map1.get(num) > 0) {
                res.add(num);
                map1.put(num, map1.get(num) - 1);
            }
        }

       
        int[] output = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            output[i] = res.get(i);
        }
        return output;
    }
}
