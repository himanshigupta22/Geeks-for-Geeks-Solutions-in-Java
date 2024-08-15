class Solution {
    long sumOfSeries(long n) {
        // code here
        long ans = 0l;
        for(int idx=1; idx<=n; idx++){
            ans += Math.pow(idx,3);
        }
        return ans;
    }
}
