class Solution {
    public int lowerBound(int[] arr, int m, int target){
        int low = 0, high = m - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    public int rowWithMax1s(int arr[][]) {
      
        int n = arr.length, m = arr[0].length;
        int index = -1, max_count = 0;
        for(int idx = 0; idx < n; idx++){
            int count_one = m - lowerBound(arr[idx], m, 1);
                if(count_one > max_count){
                    max_count = count_one;
                    index = idx;
                }

        }
        return index;
    }
}
