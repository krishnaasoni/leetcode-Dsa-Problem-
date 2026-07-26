class Solution {
    public int maximumProduct(int[] n) {
        // int n= nums.length;
        Arrays.sort(n);
        
        // for(int i=0; i<n; i++){

        //   result= (nums[i] * result );
        // }

         return Math.max(n[n.length-1] * n[n.length-2] *n[n.length-3], n[n.length-1]* n[0] * n[1]);
    }
}