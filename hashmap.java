import java.util.HashMap;
import java.util.Hashtable;
public class hashmap{
    public static void main(String[] args) {
        HashMap<Integer,String>hashmap=new HashMap<>();
        hashmap.put(1,"mayank");
        hashmap.put(2,"laxmi");
        hashmap.put(3,"praveen");
        hashmap.put(4,"vinnu");
        System.out.println(hashmap);
        System.out.println(hashmap.get(1));
        System.out.println(hashmap.size());

        Hashtable<String,Integer>hashtable=new Hashtable<>();
        hashtable.put("apple", 20);
        hashtable.put("banana",30);
        hashtable.put("orange",40);
        hashtable.put("graps", 50);
        System.out.println(hashtable);

    }
}
