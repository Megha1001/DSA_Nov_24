package hashing.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasicOperations {

    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc",123);
        map.put("dfds",332);

        System.out.println("size : "+map.size());

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
    
}
