private static int helper(int t[][], int w, int[] val, int[] wt, int n){
        if(n == 0 || w == 0){
            return 0;
        }
        
        if(t[n][w] != -1){
            return t[n][w];
        }
        
        if(wt[n-1] <= w){
             t[n][w] = Math.max(val[n-1] + helper(t, w-wt[n-1], val, wt, n-1),
                       helper(t, w, val, wt, n-1));
        } 
        else if(wt[n-1] > w){
             t[n][w] = helper(t, w, val, wt, n-1);
        }
        return t[n][w];
    }

    static int knapSack(int w, int val[], int wt[]) {
        // code here
        int n = val.length;
        int[][] t = new int[n+1][w+1];
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
               t[i][j] = -1;
            }
        }
       
        return helper(t, w, val, wt, n-1);
    
    }
