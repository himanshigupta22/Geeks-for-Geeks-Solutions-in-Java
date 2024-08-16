class Solution {

    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n) {

        // Your code here
        long power = 1;
        while(power < n){
            power *= 2;
        }
        return (power == n);
    }
}
