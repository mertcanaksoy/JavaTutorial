package com.mert.javatutorial;
import java.util.*; 
  
public class ListDemo 
{ 
    public static void main (String[] args) 
    { 
        // Bir liste oluştur
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1);  // 0. indexe 1 değerini ata
        l1.add(1, 2);  // 1. indexe 2 değerini ata
        System.out.println(l1);  // [1, 2] 
  
        // Bir liste daha oluştur
        List<Integer> l2 = new ArrayList<Integer>(); 
        l2.add(1); 
        l2.add(2); 
        l2.add(3); 
  
        // l1'de 1. indexe l2' listesini ekle
        l1.addAll(1, l2); 
        System.out.println(l1); 
  
        // 1. indexteki elemanı sil
        l1.remove(1);      
        System.out.println(l1); // [1, 2, 3, 2] 
  
        System.out.println(l1.get(3)); 
  
        // 0 ve 5. indexteki elemanları değiştir
        l1.set(0, 5);    
        System.out.println(l1);  
    } 
}
/*OUTPUT
[1, 2]
[1, 1, 2, 3, 2]
[1, 2, 3, 2]
2
[5, 2, 3, 2]
*/


//Listede aranan elemanın indeksini döndürme
public class ListDemo 
{ 
    public static void main(String[] args) 
    { 
        List<String> l = new ArrayList<String>(5); 
        l.add("Java"); 
        l.add("ile"); 
        l.add("Listeler"); 
  
        System.out.println("first index of Java: " +l.indexOf("Java")); 
        System.out.println("last index of Listeler: " +l.lastIndexOf("Listeler")); 
        System.out.println("Index of element not present : " + l.indexOf("Arrays")); 
    } 
}
/*OUTPUT
first index of Java: 0
last index of Listeler: 2
Index of element not present : -1
*/