class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]);
        Node prevNode = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            prevNode.next = temp;
            temp.prev = prevNode;
            prevNode = temp;
        }
        return head;
    }
}
