public class linkedlist {
        Node head;
        class Node{
                 int data;
                 Node next;
                 Node(int data){       // cunstructor
                    this.data=data;
                    this.next=null;
                 }
                      // addfisrt
                }
                 public void addFirst(int data){
                    Node newNode=new Node(data);
                    if(head==null){
                        head=newNode;
                        return;
                    }
                      newNode.next=head;
                      head=newNode;
                 }
                 // addlast
                 public void addLast(int data){
                    Node newNode=new Node(data);
                    if(head==null){
                        head=newNode;
                        return;
                    }
                      Node currNode=head;
                      while(currNode.next!=null){
                        currNode=currNode.next;
                      }
                      currNode.next=newNode;
                 }

                 //print
                 public void print(){
                    
                    if(head==null){
                        System.out.println("list is empty");
                        return;
                    }
                      Node currNode=head;
                      while(currNode!=null){
                        System.out.print(currNode.data+" -> ");
                        currNode=currNode.next;
                      }
                      System.out.println("null");
                      
                 }
                 //size
                 public int size(){
                    
                    if(head==null){
                       
                        return 0;
                    }
                    int count=0;
                      Node currNode=head;
                      while(currNode!=null){
                      count++;
                        currNode=currNode.next;
                      }
                      return count;
                 }

                 //delete first
                 public void deleteFirst(){
                       if(head==null){
                        System.out.println("List is empty");
                        return;
                       }
                       head=head.next;
                 }

                 // delete last

                 public void deleteLast(){
                    if(head==null){
                        System.out.println("list is empty");
                        return;
                    }
                    if(head.next==null){
                        head=null;
                    }
                    Node lastNode=head.next;
                    Node secondLast=head;
                    while(lastNode.next!=null){
                        lastNode=lastNode.next;
                        secondLast=secondLast.next;
                    }
                    secondLast.next=null;

                 }
                       
   public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.deleteFirst();
        ll.deleteLast();
        ll.print();
       System.out.println("size is: "+ll.size()); 
       
     

    
   } 
    
}
