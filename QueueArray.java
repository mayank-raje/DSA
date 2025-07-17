public class QueueArray {

             
               int [] QueueArr;
               int front;
               int capacity;
               int size;
               int rear;
               public  QueueArray(int capacity){
                          this.capacity=capacity;
                          this.size=0;
                          this.rear=-1;
                          this.front=0;
                          QueueArr = new int[capacity];
               }
               // is empty
             public boolean isEmpty(){
                return size==0;
             }
             // is full

             public boolean isFull(){
                return size==capacity;
             }

             //size
             public int size(){
                return size;
             }

             //insertion from rear

             public void enqueue(int data){
                if(isFull()){
                    System.out.println("queue is full");
                    return;
                }
                 rear=(rear+1)%capacity;
                 QueueArr[rear]=data;
                 size++;
                 System.out.println("enqueued data is:"+data);
             }
             //deletion from front
            public int dequeue(){
                if(isEmpty()){
                    System.out.println("queue is empty");
                    return -1;
                }
                int delete =QueueArr[front];
                front=(front+1)%capacity;
                size--;
                System.out.println("the dequeued data is:"+delete);
                return delete;
            }

            //peek
            public int peek(){
                if(isEmpty()){
                    System.out.println("queue is empty");
                    return-1;
                }
                return QueueArr[front];
            }
            // display 
            

            public void display(){
                if(isEmpty()){
                    System.out.println("queue is empty");
                    return;
                }
                int count=0;
                int temp=front;
                System.out.println("the elements are:");
                while(count<size){
                    System.out.print(QueueArr[temp]+" ");
                    temp=(temp+1)%capacity;
                    count++;
                }
                System.out.println();
            }


             
          public static void main(String[] args) {
            QueueArray QA=new QueueArray(3);
            QA.enqueue(10);
            System.out.println("size is :"+QA.size());
            System.out.println("peek is:"+QA.peek());
            QA.display();


            QA.enqueue(20);
            System.out.println("size is :"+QA.size());
            System.out.println("peek is:"+QA.peek());
            QA.display();


            QA.enqueue(30);
            System.out.println("size is :"+QA.size());
            System.out.println("peek is:"+QA.peek());
            QA.display();


            QA.enqueue(40);
            System.out.println("size is :"+QA.size());
            System.out.println("peek is:"+QA.peek());
            QA.display();


            QA.dequeue();
            System.out.println("size is :"+QA.size());
            System.out.println("peek is:"+QA.peek());
            QA.display();




            
          }
}
