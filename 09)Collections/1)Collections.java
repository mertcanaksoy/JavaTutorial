/*
             Collection                Map
         /     /    \      \            |
        /      /      \     \           |
     Set    List    Queue  Dequeue   SortedMap
     /
    /
 SortedSet 
*/

package com.mert.javatutorial;
import java.io.*; 
import java.util.*; 
  
public class Test 
{ 
    public static void main (String[] args) 
    { 
        int arr[] = new int[] {1, 2, 3, 4}; 
        Vector<Integer> v = new Vector(); 
        Hashtable<Integer, String> h = new Hashtable(); 
        v.addElement(1); 
        v.addElement(2); 
        h.put(1,"Collections"); 
        h.put(2,"inJava"); 
  
        System.out.println(arr[0]); 
        System.out.println(v.elementAt(1)); 
        System.out.println(h.get(1));
        System.out.println(h.get(2));
    } 
}
/*OUTPUT
1
2
Collections
inJava
*/