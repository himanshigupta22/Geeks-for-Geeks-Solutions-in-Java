class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        int cnt = 1;
        Node curr = head;
        
        while(cnt != x){
            curr = curr.next;
            cnt++;
        }
        
        if(x == 1){
            head = curr.next;
            curr.next.prev = null;
            curr.next = null;
            
        } else if(curr.next == null){
            curr.prev.next = null;
            curr.prev = null;
            
        } else{
            curr.next.prev = curr.prev;
            curr.prev.next = curr.next;
            curr.prev = null;
            curr.next = null;
            
        }
        
        return head;
    }
}
