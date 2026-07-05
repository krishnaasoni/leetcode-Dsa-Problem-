class Solution {
    public int longestSubarray(int[] nums) {
       int n= nums.length;
       int i=0;
       int maxlen=0;
       int countzero=0;

       for (int j=0; j<n; j++){
        if(nums[j]==0){
            countzero++;
        }
         while (countzero> 1){
            if(nums[i]==0){
            countzero--;
        }
           i++;
       }
       maxlen= Math.max(maxlen, j-i);
       }

    return maxlen;
    }
}