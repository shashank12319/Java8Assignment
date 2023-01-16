package com.assigmentjava8;
//In Java 8, it's possible to merge two maps using the merge() method of
//the java.util.Map interface. The merge() method takes two arguments:
//	the key for the value to be merged, and a function that defines how
//	the merge should be performed. Here's an example of how to merge two map
//	In this example, two maps map1 and map2 are created and populated with some key-value pairs. 
//	Then map2 is merged into map1 using the forEach() method and the merge() method. The merge() method
//	takes two arguments, the key and the value of the element to be merged and the function to define how
//	the merge should be performed. In this case, the Integer::sum method is used to add the values of the
//	keys that have the same name in both maps.
//
//	In this example, the merge() method is called with the key and value 
//	of the element to be merged and a function that defines how the merge should be performed.
//	In this case, the Integer::sum method is used to add the values of the keys that have the
//	same name in both maps.
//
//	Finally, the merged map is printed.
//
//	Please note that merge() method of Map will not add the
//	key-value pair to the map if the key already exist in the map.
//	In this example, the key A exist in both maps, the value 4 from map2
//	is added to the value 1 of map1 and the result is 5.

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        // First map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        // Second map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 4);
        map2.put("D", 5);
        map2.put("E", 6);

        // Merge map2 into map1
        map2.forEach((key, value) -> map1.merge(key, value, Integer::sum));

        // Print the merged map
        System.out.println(map1); // {A=5, B=2, C=3, D=5, E=6}
    }
}

