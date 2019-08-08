package com.mert.javatutorial;
import java.util.*; 
public class AbstactSetExample { 
    public static void main(String[] args) throws Exception 
    { 
        try { 
            AbstractSet<Integer> abs_set = new TreeSet<Integer>(); 
            abs_set.add(1); 
            abs_set.add(2); 
            abs_set.add(3); 
            abs_set.add(4); 
            abs_set.add(5); 
  
            System.out.println("AbstractSet: "+ abs_set); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
} 
/*OUTPUT
AbstractSet: [1, 2, 3, 4, 5]
*/


import java.util.*; 
  
public class AbstractSetExample { 
    public static void main(String[] args) throws Exception 
    {
        try { 
            AbstractSet<Integer> abs_set = new TreeSet<Integer>(); 
   
            abs_set.add(1); 
            abs_set.add(2); 
            abs_set.add(3); 
            abs_set.add(4); 
            abs_set.add(5); 
  
            System.out.println("AbstractSet before "+ "removeAll() operation : "+ abs_set); 
  
            Collection<Integer> arrlist2 = new ArrayList<Integer>(); 
            arrlist2.add(1); 
            arrlist2.add(2); 
            arrlist2.add(3); 
  
            System.out.println("Collection Elements"+ " to be removed : "+ arrlist2); 
  
            abs_set.removeAll(arrlist2);
  
            System.out.println("AbstractSet after "+ "removeAll() operation : "+ abs_set); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 
/*OUTPUT
AbstractSet before removeAll() operation : [1, 2, 3, 4, 5]
Collection Elements to be removed : [1, 2, 3]
AbstractSet after removeAll() operation : [4, 5]
*/