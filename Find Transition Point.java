

class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        int left = 0, right = n-1;
        int ans = -1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(arr[mid] == 0){
                left = mid + 1;
        
            } else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
}
