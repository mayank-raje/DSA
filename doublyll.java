public class doublyll {
          Node head;
         
          public class Node{
                    int data;
                    Node next;
                    Node prev;
                   

                    Node(int data){
                        this.data=data;
                         this.next=null;
                         this.prev=null;
                         
                    }
                }
                    //size
                    public int size(){
                    
                        if(head==null){
                           
                            return 0;
                        }
                        if(head.next==null){
                            return 1;
                        }
                        int count=0;
                          Node currNode=head;
                          while(currNode!=null){
                          count++;
                            currNode=currNode.next;
                          }
                          return count;
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

                         // addfisrt;
                         public void addFirst(int data){
                            Node newNode=new Node(data);

                            if(head==null){
                            head=newNode;
                            return;
                            }
                            newNode.next=head;
                            head.prev=newNode;
                            head=newNode;
                            
                         }
                         // addlast
                         public void addlast(int data){
                            Node newNode=new Node(data);
                               if(head==null){
                                head=newNode;
                                     return;
                               }
                               Node currNode =head;
                               while(currNode.next!=null){
                                currNode=currNode.next;
                               }
                               currNode.next=newNode;
                               newNode.prev=currNode;
                            }
                           // deletfirst 
                        public void deleteFirst(){
                            if(head==null){
                            System.out.println("list is empty");
                             return;
                            }
                            if(head.next==null){
                                head=null;
                                return;
                            }

                            head.next.prev=null;
                            head=head.next;

                        }
                         //delet last
                         public void deleteLast(){
                            if(head==null){
                                System.out.println("list is empty");
                                 return;
                                }
                                if(head.next==null){
                                    head=null;
                                    return;
                                }

                                Node secondlast=head;
                                Node lastnode=head.next;
                                while(lastnode.next!=null){
                                    secondlast=secondlast.next;
                                    lastnode=lastnode.next;
                                }
                                secondlast.next=null;

                         }

        
                         public static void main(String[] args) {
                            doublyll ll=new doublyll();
                            ll.addFirst(10);
                            ll.addFirst(20);
                            
                            ll.addlast(30);
                            ll.print();
                            ll.deleteFirst();
                            ll.deleteLast();
                            ll.print();
                            System.out.println("the size: "+ll.size());
                         }
}
