
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int or = image[sr][sc];
        int r = image.length;
        int c = image[0].length;
        if(or == color) return image;
        dfs(sr, sc, image, r, c, or, color);
        return image;
    }

    public void dfs(int i, int j, int[][] grid, int r, int c, int or, int color) {
        if (i < 0 || j < 0 || i == r || j == c || grid[i][j] != or) {
            return;
        }
        grid[i][j] = color;

        dfs(i, j + 1, grid, r, c, or, color); // right
        dfs(i + 1, j, grid, r, c, or, color); // bottom
        dfs(i, j - 1, grid, r, c, or, color); // left
        dfs(i - 1, j, grid, r, c, or, color); // top
    }
}