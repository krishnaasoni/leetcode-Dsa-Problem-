// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int i=0;
//         int j=1;
//         int n= nums.length-1;

//      while (i<n){
//         if(nums[i]== nums[j]){
//           return true ;
//         }

//         i++;
//         j++;
//      }

//      return false;

//     }
// }





// or /// using the hashset 



class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set= new HashSet<>();


       for (int i: nums){
        if(!set.add(i)){
            return true;
        }
       }
          return false;
    }
}
