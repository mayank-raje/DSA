import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class binaryTree {
    Scanner sc=new Scanner(System.in);
    class Node {
        int data;
        Node left;
        Node right;


        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // create tree

    public Node creatTree(){
       
             System.out.println("the element are");
             int data=sc.nextInt();
             if(data==-1){
                return null;
             }
             Node root=new Node(data);
             System.out.println("eneter the left element of "+data);
             root.left=creatTree();
             System.out.println("enter the right element of "+data);
             root.right=creatTree();
             return root;

    } 
    // traversal
    // DFS
    // preeorder
    public void preorder(Node root){
                 if(root==null){
                    return ;
                 }
                 

                 System.out.print(root.data+" ");  //N

                 preorder(root.left); //L

                 preorder(root.right); //R

    }
        // inorder
    public void inorder(Node root){
        if(root==null){
           return ;
        }
     

        inorder(root.left); //L

        System.out.print(root.data+" ");  //N

        inorder(root.right); //R

}          
    // postoredr
public void postorder(Node root){
    if(root==null){
       return ;
    }


    postorder(root.left); //L

    postorder(root.right); //R

    System.out.print(root.data+" ");  //N


}   

               //BFS
           // level order    
           
           
           public void levelorder(Node root){
            if(root ==null){
                return; 
            }
                  Queue<Node> q=new LinkedList<>();
                  q.offer(root);
                  q.add(null);

                  while(!q.isEmpty()){
                    Node temp=q.poll();
                    if(temp==null){
                        if(!q.isEmpty()){
                            q.add(null);
                            System.out.println();
                        }
                        else {
                            if(temp.right!=null){
                               q.add(temp.right);
                            }
                            if(temp.left!=null){
                                  q.add(temp.left);
                            }
                        }
                        System.out.println(temp.data+" ");
                    }
                  }
                 
    }  
    
            // search 
            
            public boolean search(Node root,int data){
                if(root ==null){
                    return false;
                }
                 if(root.data==data){
                    return true;
                 }
                 return search(root.left, data) || search(root.right, data);
            }
       
            // findmax

            public int findMax(Node root){
                if(root==null){
                    return Integer.MIN_VALUE;
                }
                int leftmax=findMax(root.left);
                int rightmax=findMax(root.right);
                return Math.max(root.data,Math.max(leftmax,rightmax));
            }

            // findmin

            public int findMin(Node root){
                if(root==null){
                    return Integer.MAX_VALUE;
                }
                int leftmin=findMin(root.left);
                int rightmin=findMin(root.right);
                return Math.min(root.data,Math.min(leftmin,rightmin));
            }

            // sum of leaf

            public int sumOfLeaf(Node root){
                if(root==null){
                    return 0;

                }

                if(root.left==null && root.right==null){
                    return root.data;
                }
                return sumOfLeaf(root.left)+sumOfLeaf(root.right);
            }
            public static void main(String[] args) {
                binaryTree bt=new binaryTree();
                Node root=null;
                root=bt.creatTree();
                System.out.println("inorder traversal is:");
                bt.inorder(root);

                System.out.println("preeoreder traversal is :");
                bt.preorder(root);

                System.out.println("postoreder traversal is :");
                bt.postorder(root);

                System.out.println("levelorder traversal is :");
                bt.levelorder(root);

                System.out.println("max is:"+bt.findMax(root));

                System.out.println("min is:"+bt.findMin(root));


            }

        
                             
         
}
