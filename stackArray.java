public class stackArray {
     
      public int top;
      public int size;
      public int[] stackArr;

      public stackArray(int size){
        this.size=size;
        this.stackArr =new int[size];
        this.top=-1;
      }

      // isEmpty

      public boolean isEmpty(){
               return top==-1;
      }
     //isFull
      public boolean isFull(){
        return (top==size-1);
      }

      // push

      public void push(int element){
              if(isFull()){
                System.out.println("stack is full");
                return;
              } else {
              top++;
              stackArr[top]=element;
                 System.out.println("element is pushed:"+element);
              }
      }
      // pop
      public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        } else {
            int popped=stackArr[top--];
            System.out.println("the poped element is:"+popped);
        
         return popped;}
      }
      // size

      public int size(){ 
           return top+1;
      }

      // peek

      public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        } else {
        return stackArr[top];
        }
      }
      // display
      public void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }  else {
            System.out.println("the stack are:");
                for(int i=0;i<=top;i++){
                    System.out.print(stackArr[i]+" ");
                }
                System.out.println();

        }
      }
      public static void main(String[] args) {
        stackArray sa =new stackArray(3);
        sa.push(10);
        System.out.println("size is:"+sa.size());
        sa.display();

        sa.push(20);
        System.out.println("size is:"+sa.size());
        sa.display();

        sa.push(30);
        System.out.println("size is:"+sa.size());
        sa.display();

        sa.push(40);
        System.out.println("size is:"+sa.size());
        sa.display();
        System.out.println("the peek is:"+sa.peek());
      }



}
