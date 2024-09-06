class Solution
{
    public void  Addition(int[][] matrixA, int[][] matrixB)
    {
        // code here
        int n = matrixA.length;
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                matrixA[row][col] += matrixB[row][col];
            }
        }
       
    }
}
