class Solution {
    public static Node findTail(Node head){
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        return tail;
    }
    
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        Node left = head;
        Node right = findTail(head);
        
        while(left.data < right.data == true){
            int sum = left.data + right.data;
            if(sum == target){
                ArrayList<Integer> res = new ArrayList<>();
                res.add(left.data);
                res.add(right.data);
                ans.add(res);
                left = left.next;
                right = right.prev;
                
            } else if(sum < target){
                left = left.next;
                
            } else {
                right = right.prev;
                
            }
        }
        return ans;
    }
}
     
