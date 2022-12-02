package geekbrains;

public class Task2 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prevColor = image[sr][sc];
        if (prevColor == color) {
            return image;
        }
        dfs(image, sr, sc, prevColor, color);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int prevColor, int color) {
        if (sr < 0 || sr >= image.length || sc < 0
                || sc >= image[0].length || image[sr][sc] != prevColor) {
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr - 1, sc, prevColor, color);
        dfs(image, sr + 1, sc, prevColor, color);
        dfs(image, sr, sc - 1, prevColor, color);
        dfs(image, sr, sc + 1, prevColor, color);
    }
}
