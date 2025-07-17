import java.util.*;
public class linearsearch {
    


        public static void main(String[] args) {
           
int ans=-1;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array ");
        for(int i=0;i<size;i++){
                    arr[i]=sc.nextInt();
        }
        System.out.println("enter to find no");
     int x=sc.nextInt();
     for(int i=0;i<size;i++){
        if(arr[i]==x){
            ans=i;
        }
     }
     System.out.println("th index of "+x +" is: "+ans); 
}       
    
     
    }



