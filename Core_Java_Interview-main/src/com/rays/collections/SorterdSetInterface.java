package com.rays.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SorterdSetInterface {

    public static void main(String[] args) {
        // Create a TreeSet object that implements SortedSet
        SortedSet s = new TreeSet();
        
        // Add elements to the TreeSet
        s.add(100);  // Adds 100 to the set
        s.add(20);   // Adds 20 to the set
        s.add(300);  // Adds 300 to the set
        s.add(400);  // Adds 400 to the set
        s.add(500);  // Adds 500 to the set
        s.add(100);
        s.add("kapil");
        
        // Print the first (smallest) element in the set
        System.out.println(s.first()); // Output: 20
        
        // Print the last (largest) element in the set
        System.out.println(s.last());  // Output: 500
        
        // Print the size of the set
        System.out.println(s.size());  // Output: 5
        
        // Print a view of the set from 200 (inclusive) to the end
        System.out.println(s.tailSet(200)); // Output: [300, 400, 500]
        
        // Print a view of the set from the beginning to 400 (exclusive)
        System.out.println(s.headSet(400)); // Output: [20, 100, 300]
    }
}
