class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }

        HashSet<Integer> res= new HashSet<>();
         
         for (int num: nums2){
            if(set1.contains(num)){
                 res.add(num);
            }
         }

         int []output= new int[res.size()];

         int i=0;
         for (int num: res){
            output[i]= num;
            i++;
         }

         return output;

    }
}