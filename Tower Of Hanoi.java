class Solution {

    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        if(n == 0) return 0;
        int ans = (1 << n) - 1;
        return ans;
    }
}
