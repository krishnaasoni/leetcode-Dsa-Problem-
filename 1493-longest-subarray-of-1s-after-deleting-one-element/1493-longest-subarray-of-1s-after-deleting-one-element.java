class Solution {
    public int longestSubarray(int[] nums) {
       int n= nums.length;
    //    int i=0;
    //    int maxlen=0;
    //    int countzero=0;

    //    for (int j=0; j<nums.length; j++){
    //     if(nums[j]==0){
    //         countzero++;
    //     }
    //      while (countzero> 1){
    //         if(nums[i]==0){
    //         countzero--;
    //     }
    //        i++;
    //    }
    //    maxlen= Math.max(maxlen, j-i);
    //    }

    // return maxlen;


    int  window=0;
    int left=0;
    int ans=0;
    for (int r=0; r<n ; r++){
        window +=nums[r];

        while(window+1 < r-left+1){
            
            window-= nums[left++];
        }
            ans= Math.max(ans , r-left+1);
    }
    return ans-1;
    }
}