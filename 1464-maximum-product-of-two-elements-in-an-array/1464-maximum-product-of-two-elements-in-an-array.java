class Solution {
    public int maxProduct(int[] n) {
      Arrays.sort(n);

      return Math.max((n[n.length-1]-1)* (n[n.length-2]-1) , n[1]-1 * n[1]-1);
        
    }
}