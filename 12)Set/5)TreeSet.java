package com.mert.javatutorial;
import java.util.*; 
  
public class TreeSetDemo { 
    public static void main(String[] args) 
    { 
        TreeSet<String> ts1 = new TreeSet<String>(); 
  
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C"); 
  
        // Tekrar eklenmeye çalışıln değer eklenmeyecektir
        ts1.add("C"); 
  
        // Sıralama (Ascending) 
        System.out.println(ts1); 
    } 
} 
/*OUTPUT
[A, B, C]
*/