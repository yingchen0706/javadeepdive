class Solution {
    public int uniquePaths(int m, int n) {
        /*
         * int[][] matrix = new int[n][m];
         * 
         * for (int i = 0; i < n; i++) { matrix[i][0] = 1; } for (int j = 0; j < m; j++)
         * { matrix[0][j] = 1; } for (int i = 1; i < n; i++) { for (int j = 1; j < m;
         * j++) { matrix[i][j] = matrix[i - 1][j] + matrix[i][j-1]; } } return
         * matrix[n-1][m-1];
         */

        int[] pre = new int[m];
        int[] cur = new int[m];
        for (int i = 0; i < m; i++) {
            pre[i] = 1;
            cur[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                cur[j] = cur[j - 1] + pre[j];
            }
            for (int j = 1; j < m; j++) {
                pre[j] = cur[j];
            }
        }
        return cur[m - 1];
    }
}
