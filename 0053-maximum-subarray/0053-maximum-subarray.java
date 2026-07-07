class Solution {
    public int maxSubArray(int[] nums) {
        // int  n= nums.length;
        // int sum =0;
        // int max=  nums[0];

        // //solve by Kadane’s Algorithm 
        // for (int  i=0; i<n; i++){
        //     sum +=nums[i];
        
        //      max= Math.max(max, sum);
        //     if(sum<0){
        //         sum =0;
        //     }
           
        // }
        //     return max;

         int window= 0;
         int ans =Integer.MIN_VALUE;
         
         for(int i=0; i<nums.length; i++){
            window= Math.max(window + nums[i], nums[i]);
            ans= Math.max(ans , window );
         }
       return ans;
    }
}