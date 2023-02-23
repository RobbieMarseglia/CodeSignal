int[][] solution(boolean[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;
    int[][] nums = new int[n][m];
    int[] dir = {-1, 0, 1};
    
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            if (matrix[i][j]) { // mine present
                // Add 1 to surrounding squares
                for (int r : dir) { // change in row
                    for (int c : dir) { // change in column
                        if (!(r == 0 && c == 0)) {
                            int x = i+r;
                            int y = j+c;
                            if (x >= 0 && x < n && y >= 0 && y < m) nums[x][y]++;
                        }
                    }
                }
            }
        }
    }
    
    return nums;
}
