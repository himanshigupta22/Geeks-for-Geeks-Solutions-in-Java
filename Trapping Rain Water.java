class Solution {
    public int trappingWater(int arr[]) {
        // code here
        int n = arr.length;
        
        int maxL[] = new int[n];
        int maxR[] = new int[n];
        
        maxL[0] = arr[0];
        maxR[n-1] = arr[n-1];
        
        for(int i = 1; i < n; i++){
            maxL[i] = Math.max(maxL[i-1], arr[i]);
        }
        
        for(int i = n-2; i >= 0; i--){
            maxR[i] = Math.max(maxR[i+1], arr[i]);
        }
        
        int sum = 0;
        int water[] = new int[n];
        
        for(int i = 0; i < n; i++){
            water[i] = Math.min(maxL[i], maxR[i]) - arr[i];
            sum += water[i];
        }
        
     
        return sum;
    }
}
