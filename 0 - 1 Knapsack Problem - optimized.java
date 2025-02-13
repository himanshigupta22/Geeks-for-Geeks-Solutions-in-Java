 private static int helper(int t[][], int w, int[] val, int[] wt, int n){
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < w+1; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < w+1; j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max((val[i-1] + t[i-1][j-wt[i-1]]), t[i-1][j]);
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
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
       
        return helper(t, w, val, wt, n);
    
    }
