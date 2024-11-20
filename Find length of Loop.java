class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                int length = 1;
                slow = slow.next;
                
                while(slow != fast){
                    slow = slow.next;
                    length++;
                }
                
                return length;
            }
        }
        
        return 0;
    }
}
