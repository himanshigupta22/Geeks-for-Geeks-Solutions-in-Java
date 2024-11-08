class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        if(head == null){
            Node head2 = new Node(x);
            return head2;
        }    
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node temp2 = new Node(x);
        temp.next = temp2;
        
        return head;
    }
}
