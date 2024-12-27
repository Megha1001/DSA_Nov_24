package newDataStructures;

import java.util.AbstractMap;
 
class AbstractMapSimpleEntry {
 
    public static void main(String[] args)
    {
       AbstractMap.SimpleEntry<Integer, String> pair = new AbstractMap.SimpleEntry<>(10,"Simple Entry");
        System.out.println("The First value is :"
                           + pair.getKey());
        System.out.println("The Second value is :"
                           + pair.getValue());
    }
}
