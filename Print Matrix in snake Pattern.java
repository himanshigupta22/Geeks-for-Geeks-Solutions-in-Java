class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int row = 0; row < matrix.length; row++){
            if(row%2 == 0){
                for(int col = 0; col < matrix[0].length; col++){
                   res.add(matrix[row][col]);
                }
            } else {
                for(int col = matrix[0].length-1; col >= 0; col--){
                   res.add(matrix[row][col]);
                }
            }
        }
        return res;
    }
}
