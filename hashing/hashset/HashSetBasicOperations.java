package hashing.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasicOperations {
    

    public static void main(String args[]){
        HashSet<String> s = new HashSet<>();

        s.add("abc");
        
        Iterator<String> iterator = s.iterator();

        while(iterator.hasNext()){
           System.out.print(iterator.next()+" "); 
        }


    }

}
