class Solution {
    int maxRepeating(int k, int[] arr) {
        // code here
        int[] freq = new int[k];
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        int maxCount = freq[0];
        int result = 0;
        
        for(int idx = 1; idx < k; idx++){
            if(freq[idx] > maxCount){
                maxCount = freq[idx];
                result = idx;
            } else if(freq[idx] == maxCount && idx < result){
                result = idx;
            }
        }
        return result;
    }
}
