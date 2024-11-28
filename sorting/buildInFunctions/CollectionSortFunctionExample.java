package sorting.buildInFunctions;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortFunctionExample {

    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(79);
        list.add(84);

        Collections.sort(list);
        System.out.println(list);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
    
}
