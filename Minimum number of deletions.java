class Solution 
{ 
    public int lcs(String s1, String s2) {
        // your code here
        int n = s1.length();
        int m = s2.length();
        int t[][] = new int[n+1][m+1];
        
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                } else {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        
        return t[n][m];
        
    }
    public int longestPalinSubseq(String s) {
        // code here
        String rs = new StringBuilder(s).reverse().toString();
        
        return lcs(s, rs);
        
    }
    int minDeletions(String str, int n)
    {
        // code here
        int lps = longestPalinSubseq(str);
        return n - lps;
    }
} 
