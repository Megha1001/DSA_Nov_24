package hashing.hashset;

import java.util.HashSet;
import java.util.Iterator;
/*
 * Operations : add(<T> key), remove(<T> key), contains(<T> key), clear(), size(), isEmpty()
 */

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
        System.out.println("hashset size: "+s.size());
        System.out.println("hashset : "+s);

        s.clear();
        System.out.println("hashset new size: "+s.size());
        System.out.println("hashset empty?: "+s.isEmpty());

    }

}
