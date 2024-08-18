class Solution{
    static void printPattern(int N){
        // code here
        for(int row = 1; row<=N; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}
