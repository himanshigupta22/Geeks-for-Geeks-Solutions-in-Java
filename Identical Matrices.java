class Solution {
    int areMatricesIdentical(int N, int[][] g1, int[][] g2) {
        // code here
        for(int row=0; row<N; row++){
            for(int col=0; col<N; col++){
                if(g1[row][col] != g2[row][col]){
                    return 0;
                }
            }
        }
        return 1;
    }
}
