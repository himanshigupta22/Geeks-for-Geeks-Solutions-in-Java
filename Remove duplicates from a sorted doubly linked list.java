class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head.next;
        
        while(temp != null){
            if(temp.data == temp.prev.data){
                Node delete = temp;
                temp.prev.next = temp.next;
                if(temp.next != null){
                    temp.next.prev = temp.prev;
                }
                temp = temp.next;
                delete.prev = null;
                delete.next = null;
                
            
            } else {
                temp = temp.next;
            }
        }
        return head;
        
    }
}
