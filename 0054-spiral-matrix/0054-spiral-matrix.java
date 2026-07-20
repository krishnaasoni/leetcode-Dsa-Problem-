
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int top = 0, left = 0, bottom = r - 1, right = c - 1;

        List<Integer> ans = new ArrayList<>();

        while (top <= bottom && left <= right) {
            //(1) left to right
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            // (02) top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;

            // (03) right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            // (04) bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}