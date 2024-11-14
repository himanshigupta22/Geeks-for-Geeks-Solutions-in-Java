class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        if(head.next == null) return head;
        
        Node zerosHead = null;
        Node onesHead = null;
        Node twosHead = null;
        
        Node zerosTail = null;
        Node onesTail = null;
        Node twosTail = null;
        
        Node temp = head;
        
        while(temp != null){
            if(zerosHead == null && temp.data == 0){
                zerosHead = temp;
                zerosTail = temp;
                
            } else if(onesHead == null && temp.data == 1){
                onesHead = temp;
                onesTail = temp;
                
            } else if(twosHead == null && temp.data == 2){
                twosHead = temp;
                twosTail = temp;
                
            } else if(temp.data == 0){
                zerosTail.next = temp;
                zerosTail = temp;
                
            } else if(temp.data == 1){
                onesTail.next = temp;
                onesTail = temp;
                
            } else if(temp.data == 2){
                twosTail.next = temp;
                twosTail = temp;
                
            }
            
            temp = temp.next;
        }
        
        if((zerosHead == null && onesHead == null) || (zerosHead == null && twosHead == null) ||
          (twosHead == null && onesHead == null))  {
              return head;
          }
        
        if(zerosHead == null){
            onesTail.next = twosHead;
            twosTail.next = null;
            
            return onesHead;
            
        } else if(onesHead == null){
            zerosTail.next = twosHead;
            twosTail.next = null;
            
            return zerosHead;
            
        } else if(twosHead == null ){
            zerosTail.next = onesHead;
            onesTail.next = null;
            
            return zerosHead;
            
        } else {
            zerosTail.next = onesHead;
            onesTail.next = twosHead;
            twosTail.next = null;
        
        }
        
        return zerosHead;
    }
}
