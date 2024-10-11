class Solution {
    long floorSqrt(long n) {
        // Your code here
        long low = 1, high = n;
        while(low <= high){
            long mid = (low + high) / 2;
            if(mid * mid <= n){
                low = mid + 1;
            } else if(mid * mid > n){
                high = mid - 1;
            }
        }
        return high;
    }
}
