class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int low = 0, high = arr.length-1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key) return mid;
            
            // left sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= key && key <= arr[mid])
                   high = mid - 1;
                else 
                   low = mid + 1;
                
            } else { // right sorted
                if(arr[mid] <= key && key <= arr[high])
                    low = mid + 1;
                else 
                    high = mid - 1;
                
            }
        }
        return -1;
    }
}
