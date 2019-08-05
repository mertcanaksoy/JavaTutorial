package com.mert.javatutorial;
import java.util.*; 
public class SetExample 
{ 
    public static void main(String[] args) 
    { 
        Set<String> hashSet = new HashSet<String>(); 
        hashSet.add("Java"); 
        hashSet.add("Set"); 
        hashSet.add("Example"); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(hashSet); 
  
        // Set sıralanır
        System.out.print("Sorted Set after passing into TreeSet"); 
        Set<String> treeSet = new TreeSet<String>(hashSet); 
        System.out.println(treeSet); 
    } 
} 
/*OUTPUT
Set output without the duplicates[Java, Set, Example]
Sorted Set after passing into TreeSet[Example, Java, Set]
*/

