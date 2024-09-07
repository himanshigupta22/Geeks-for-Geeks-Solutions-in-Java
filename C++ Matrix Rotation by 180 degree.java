class Solution
{
    public void  rotate(int[][] matrix)
    {
        // code here
        int n = matrix.length;
        int up = 0, down = n-1;
        
        for(int row=0; row<n; row++){
            int left = 0, right = n-1;
            while(left < right){
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++; right--;
            }
        }
        
        while(up < down){
            for(int col=0; col<n; col++){
                int temp = matrix[up][col];
                matrix[up][col] = matrix[down][col];
                matrix[down][col] = temp;
            }
            up++; down--;
        }
    }
}
