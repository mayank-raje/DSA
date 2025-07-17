import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;
public class phonebook_project1 {
    private HashMap <String,String>phonebook;
    public phonebook_project1(){
        phonebook=new HashMap<>();     // space using cunstructor
    } 

    public void addentry(String name,String number){
        phonebook.put(name,number);                          /// inserting
    }

    public String search(String name){
        return phonebook.getOrDefault(name,"number not found");    //gives the no. of name;
    }                                                                           //searching
    public void display(){
        if(phonebook.isEmpty()){
            System.out.println("phonebook is empty");
            return;
        }                                                    //display
        for(String name:phonebook.keySet()){
            System.out.println(name+":"+phonebook.get(name));
        }
        
    }
    public static void main(String[] args) {
        phonebook_project1 obj=new phonebook_project1();   //object of class
           obj.addentry("mayank", "6261723252");
           Scanner sc=new Scanner(System.in);
           System.out.println("enter a name and no:");
           for(String x:obj.phonebook.keySet()){
           
            obj.addentry(sc.next(x), sc.next(x));
           }
           obj.display();
    }

}
