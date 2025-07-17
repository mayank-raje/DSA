public class QueueLinkedlist {
        Node front;
        Node rear;
        int size;
         
        public class Node {
            Node next;
            int data;

         public Node(int data){
            this.data=data;
            this.next=null;
        }
      }

         public QueueLinkedlist(){
            this.front=rear=null;
            this.size=0;
            
         }

         // is empty

         public boolean isEmpty(){
             return size==0;
         }

         // peek

         public int peek(){
            return front.data;
         }
         // size
         public int size(){
            return size;
         }

         // insert at rear

         public void enQueue(int data){
            Node newnode=new Node(data);
            if(front==null){
                front=rear=newnode;
                size++;
                System.out.println("element is enqued:"+data);
                
            } else {

            rear.next=newnode;
            rear =newnode;
            size++;
            System.out.println("element is enqued:"+data);
            }

         }

         // deletion at front

        public int deQueue(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int remove=front.data;
            front =front.next;
            size--;
            System.out.println("the dequede element is"+remove);
            return remove;
        }

        // display

        public void display(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return;

            }

            Node temp=front;
            System.out.println("The queue element are:");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
           
            System.out.println();
        }
        public static void main(String[] args) {
            QueueLinkedlist QL =new QueueLinkedlist();

            QL.enQueue(10);
            System.out.println("the peek is:"+QL.peek());
            System.out.println("the size is:"+QL.size());
            QL.display();

            QL.enQueue(20);
            System.out.println("the peek is:"+QL.peek());
            System.out.println("the size is:"+QL.size());
            QL.display();

            QL.enQueue(30);
            System.out.println("the peek is:"+QL.peek());
            System.out.println("the size is:"+QL.size());
            QL.display();

            QL.enQueue(40);
            System.out.println("the peek is:"+QL.peek());
            System.out.println("the size is:"+QL.size());
            QL.display();

            QL.deQueue();



        }


}
