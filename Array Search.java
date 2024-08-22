class Solution {

    static int search(int arr[], int x) {

        // Your code here
        for(int idx=0; idx<arr.length; idx++){
            if(arr[idx] == x) return idx;
        }
        return -1;
    }
}
