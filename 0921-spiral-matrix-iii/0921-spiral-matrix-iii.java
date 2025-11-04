class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int total = rows * cols;
        int[][] ans = new int[total][2];
        int idx = 0;
        int r = rStart, c = cStart;
        ans[idx++] = new int[]{r, c};
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int stepLen = 1;

        while (idx < total) {
            for (int d = 0; d < 4; d++) {
                int steps = stepLen;
                for (int i = 0; i < steps; i++) {
                    r += dir[d][0];
                    c += dir[d][1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        ans[idx++] = new int[]{r, c};
                        if (idx == total) return ans;
                    }
                }
                if (d % 2 == 1) stepLen++;
            }
        }
        return ans;
    }
}
