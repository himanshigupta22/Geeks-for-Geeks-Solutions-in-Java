class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        Node curr = head;
        int cnt = 0;
        
        while(cnt != p){
            curr = curr.next;
            cnt++;
        }
        Node temp = new Node(x);
        if(curr.next == null){
            temp.prev = curr;
            curr.next = temp;
        } else {
            temp.next = curr.next;
            curr.next.prev = temp;
            temp.prev = curr;
            curr.next = temp;
        }
        return head;
    }
}
