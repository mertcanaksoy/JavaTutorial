package com.mert.javatutorial;
import java.util.*;
public class DictionaryExample 
{ 
    public static void main(String[] args) 
    { 
  
        Dictionary test = new Hashtable(); 
  
        // put() method 
        test.put("123", "Code"); 
        test.put("456", "Program"); 
  
        // elements() method : 
        for (Enumeration i = test.elements(); i.hasMoreElements();) 
        { 
            System.out.println("Value in Dictionary : " + i.nextElement()); 
        } 
  
        // get() method : 
        System.out.println("\nValue at key = 6 : " + test.get("6")); 
        System.out.println("Value at key = 456 : " + test.get("123")); 
  
        // isEmpty() method : 
        System.out.println("\nThere is no key-value pair : " + test.isEmpty() + "\n"); 
  
        // keys() method : 
        for (Enumeration k = test.keys(); k.hasMoreElements();) 
        { 
            System.out.println("Keys in Dictionary : " + k.nextElement()); 
        } 
  
        // remove() method : 
        System.out.println("\nRemove : " + test.remove("123")); 
        System.out.println("Check the value of removed key : " + test.get("123")); 
  
        System.out.println("\nSize of Dictionary : " + test.size()); 
  
    } 
} 
/*OUTPUT
Value in Dictionary : Code
Value in Dictionary : Program

Value at key = 6 : null
Value at key = 456 : Code

There is no key-value pair : false

Keys in Dictionary : 123
Keys in Dictionary : 456

Remove : Code
Check the value of removed key : null

Size of Dictionary : 1
*/