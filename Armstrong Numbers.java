class Solution {
    static String armstrongNumber(int n) {
        // code here
        int copy = n;
        int sum = 0;
        
        while(copy != 0){
            int rem = copy%10;
            sum += (int)Math.pow(rem,3);
            copy /= 10;
        }
        return (sum == n) ? "true" : "false";
    }
}
