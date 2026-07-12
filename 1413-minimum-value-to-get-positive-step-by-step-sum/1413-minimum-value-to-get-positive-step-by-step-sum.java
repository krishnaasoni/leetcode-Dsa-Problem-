class Solution {
    public int minStartValue(int[] nums) {
        int n= nums.length;
        int prefixsum=0;
        int minPrefix=0;

        for (int i=0; i<n; i++){
            prefixsum = prefixsum + nums[i];
            minPrefix= Math.min(prefixsum, minPrefix);
        }

        return 1-minPrefix;
    }
}