import java.util.*;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];

        // Step 1: Construct prefixGcd
        int currentMax = nums[0];
        prefixGcd[0] = gcd(nums[0], currentMax);

        for (int i = 1; i < n; i++) {
            currentMax = Math.max(currentMax, nums[i]);
            prefixGcd[i] = gcd(nums[i], currentMax);
        }

        // Step 2: Sort prefixGcd
        Arrays.sort(prefixGcd);

        // Step 3: Pair smallest + largest
        long sum = 0;
        int i = 0, j = n - 1;
        while (i < j) {
            sum += gcd(prefixGcd[i], prefixGcd[j]);
            i++;
            j--;
        }

        return sum;
    }

    // Helper gcd function
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
