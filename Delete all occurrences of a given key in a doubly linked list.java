class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        
        Node curr = head;
        
        while(curr != null){
            
            if(curr.data == x){
                if(curr.prev == null){
                    Node temp = head;
                    head = head.next;
                    head.prev = null;
                    temp.next = null;
                    curr = head;
                    continue;
                    
                } else if(curr.next == null){
                    curr.prev.next = null;
                    Node temp = curr;
                    temp.prev = null;
                    curr = null;
                    continue;
                    
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                    Node temp = curr;
                    curr = curr.next;
                    temp.next = null;
                    temp.prev = null;
                    continue;
                }
            }
            curr = curr.next;
        }
        
        return head;
    }
}
