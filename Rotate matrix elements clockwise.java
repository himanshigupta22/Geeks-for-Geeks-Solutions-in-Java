class Solution {
    int[][] rotateMatrix(int M, int N, int matrix[][]) {
        
        int fr = 0, lr = M - 1;  // First row, Last row
        int fc = 0, lc = N - 1;  // First column, Last column
        int temp1 = -1, temp2 = -1;

        while (fr < lr && fc < lc) {
            temp2 = matrix[fr + 1][fc];

            for (int idx = fc; idx <= lc; idx++) {
                temp1 = matrix[fr][idx];
                matrix[fr][idx] = temp2;
                temp2 = temp1;
            }
            fr++;

            for (int idx = fr; idx <= lr; idx++) {
                temp1 = matrix[idx][lc];
                matrix[idx][lc] = temp2;
                temp2 = temp1;
            }
            lc--;

            if (fr <= lr) {
                for (int idx = lc; idx >= fc; idx--) {
                    temp1 = matrix[lr][idx];
                    matrix[lr][idx] = temp2;
                    temp2 = temp1;
                }
            }
            lr--;

            if (fc <= lc) {
                for (int idx = lr; idx >= fr; idx--) {
                    temp1 = matrix[idx][fc];
                    matrix[idx][fc] = temp2;
                    temp2 = temp1;
                }
            }
            fc++;
        }

        return matrix;
    }
}
