class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
           //add code here.
           int r1 = A.length, c1 = A[0].length;
           int r2 = B.length, c2 = B[0].length;
           
           
           for(int row=0; row<r1; row++){
               for(int col=0; col<c2; col++){
                   for(int k=0; k<c1; k++){
                       C[row][col] += A[row][k] * B[k][col];
                   }
               }
           }
        }
}
