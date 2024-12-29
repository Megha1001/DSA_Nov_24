package hashing.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasicOperations {

    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc",123);
        map.put("dfds",332);

        System.out.println("size : "+map.size());
        System.out.println("map : "+map);
        System.out.println("get abc value : "+map.get("abc"));

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        System.out.println("contains key=abc ? : "+map.containsKey("abc"));
        System.out.println("contains value=123 ? : "+map.containsValue(123));

        map.remove("abc");
        System.out.println("After removing, contains key=abc ? : "+map.containsKey("abc"));
        System.out.println("After removing, contains value=123 ? : "+map.containsValue(123));

    }
    
}
