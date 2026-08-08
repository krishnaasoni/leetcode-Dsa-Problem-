class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        int[] freq = new int[256]; // ASCII characters count

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            freq[c]++;

            // shrink window until duplicate removed
            while (freq[c] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
