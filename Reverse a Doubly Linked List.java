class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head == null || head.next == null) return head;
        DLLNode last = null;
        DLLNode current = head;
        
        while(current != null){
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            
            current = current.prev;
        }
        return last.prev;
    }
}
