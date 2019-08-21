package com.mert.javatutorial;
import java.util.*; 
  
public class Test 
{ 
    public static void main(String[]args) 
    { 
        HashSet<String> h = new HashSet<String>(); 
   
        h.add("Turkey"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("Turkey");// adding duplicate elements 
  
        System.out.println(h); 
        System.out.println("List contains Turkey or not: " + h.contains("Turkey")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
    } 
}
/*OUTPUT
[Turkey, South Africa, Australia]
List contains Turkey or not:true
List after removing Australia:[Turkey, South Africa]
Iterating over list:
Turkey
South Africa
*/