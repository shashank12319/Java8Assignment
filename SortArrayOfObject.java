package com.assigmentjava8;


import java.util.Arrays;
import java.util.Comparator;


public class SortArrayOfObject {
    public static void main(String[] args) {
        // Sorting an array of Strings - Arrays.sort() method
        String[] strArray = {
            "B",
            "D",
            "A",
            "C",
            "E"
        };

        // ascending order
        System.out.println("Before sorting => " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("After sorting => " + Arrays.toString(strArray));

        // descending order
        System.out.println("Before sorting => " + Arrays.toString(strArray));
        Arrays.sort(strArray, Comparator.reverseOrder());
        System.out.println("After sorting => " + Arrays.toString(strArray));
    }
}
