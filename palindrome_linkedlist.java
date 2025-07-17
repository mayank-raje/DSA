public class palindrome_linkedlist {
    
  
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 

    
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
                  slow=slow.next;
                  fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
         if(head==null || head.next==null){
                return true;
            }

             ListNode prev=null;
             ListNode current=middle(head);
             ListNode temp=null;
             while(current!=null){
                temp=current.next;
                current.next=prev;
                prev=current;
                current=temp;
             }
             ListNode right=prev;
             ListNode left=head;

            while(right!=null){
                if(right.val!=left.val){
                    return false;
                }
                right=right.next;
                left=left.next;
            }
            return true;
           
    }
}

