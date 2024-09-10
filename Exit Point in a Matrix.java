class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        // code here
        int row = 0, col = 0, direction = 0;
        
        while(row >= 0 && col >=0 && row < n && col < m){
            if(matrix[row][col] == 1){
                matrix[row][col] = 0;
                direction = (direction + 1) % 4;
            }
            if(direction == 0){
                // right
                col++;
                
            } else if(direction == 1){
                // down
                row++;
                
            } else if(direction == 2){
                // left
                col--;
                
            } else {
                // up
                row--;
                
            }
        }
        
        if(row < 0){
            // top
            return new int[]{row+1, col};
            
        } else if(col < 0){
            // left
            return new int[]{row, col+1};
            
        } else if(row == n){
            // bottom
            return new int[]{row-1, col};
            
        } else{
            // right
            return new int[]{row, col-1};
            
        }
    }
}
