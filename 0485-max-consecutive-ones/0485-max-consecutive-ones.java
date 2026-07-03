class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int window = 0;
        for (int i= 0; i<n; i++){
            if(nums[i]== 1){
                window++;
            }
            else{
                window=0;
            }
            ans = Math.max(ans,window);
        }
            return ans;
    }
}