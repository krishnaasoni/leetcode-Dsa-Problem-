// class Solution {
//     public int majorityElement(int[] nums) {
//     HashMap<Integer, Integer> map= new HashMap<>();
//      int n= nums.length;

//     for (int i=0; i<n; i++){
//           if(map.containsKey(nums[i])){
//             map.put(nums[i], map.get(nums[i])+1);
//         }
//         else{
//             map.put(nums[i], 1);
//         }
//     }
//            for (int key : map.keySet()){
//                     if(map.get(key)> n/2){
//                         return key;
//                     }
//            }
//            return 0;
//     }
// }



class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map= new HashMap<>();
     int n= nums.length;

    for (int i: nums){
        if(map.containsKey(i)){
            int val= map.get(i);
            map.put(i, val+1);
        }
        else{
            map.put(i, 1);
        }
        if(map.get(i)> n/2){
            return i;
        }
    }

           return 0;
    }
}