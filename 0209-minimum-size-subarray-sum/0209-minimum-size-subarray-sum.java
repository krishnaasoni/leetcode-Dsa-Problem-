class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int window =0;
        int l= 0;
        int ans = n+1; 
        for(int r=0; r<n; r++){
            window = window + nums[r];
            while (window >= target ) {
                ans = Math.min(ans, r-l+1);
                window = window -nums[l++];
            }
        } 
        return ans == n+1? 0:ans ;
    }
}