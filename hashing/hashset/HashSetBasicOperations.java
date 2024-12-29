package hashing.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasicOperations {
    

    public static void main(String args[]){
        HashSet<String> s = new HashSet<>();

        s.add("abc");
        
        Iterator<String> iterator = s.iterator();

        while(iterator.hasNext()){
           System.out.println(iterator.next()+" "); 
        }

        s.remove("abc");

        while(iterator.hasNext()){
            System.out.println(iterator.next()+" "); 
        }
        
        s.add("123");
        System.out.println("contains 123? "+s.contains("123"));
        s.add("12a");

        System.out.println("hashset : "+s);

    }

}
