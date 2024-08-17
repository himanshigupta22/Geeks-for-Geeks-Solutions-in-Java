class Solution{
    static int evenlyDivides(int N){
        // code here
        int copy = N;
        int count=0;
        
        while(copy != 0){
           int digit = copy%10;
            
            if(digit !=0 && N % digit == 0){
                count++;
            }
            copy /= 10;
        }
        return count;
    }
}
