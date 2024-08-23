class Solution {
    public int binarysearch(int[] arr, int k) {
        return binaryS(0, arr.length - 1, arr, k);
    }
    
    private int binaryS(int low, int high, int[] arr, int k) {
        if (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == k) return mid;
         
            if (arr[mid] < k) 
                return binaryS(mid + 1, high, arr, k);
            
            
            else
                return binaryS(low, mid - 1, arr, k);
        }
        
  
        return -1;
    }
}
