
public class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i = 0;
        int n = word.length();
        char c = word.charAt(0);
        int count = 0;
        while (i < n) {
            if (word.charAt(i) == c && count < 9) {
                count++;
                i++;
            } else {
                comp.append(count).append(c);
                c = word.charAt(i);
                count = 0;
            }

        }
        comp.append(count).append(c);
        return comp.toString();
    }
}