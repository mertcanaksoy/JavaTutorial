package com.mert.javatutorial;
import java.util.*; 
import java.util.concurrent.LinkedBlockingQueue; 
  
public class Test { 
    public static void main(String[] argv) 
        throws Exception 
    { 
        AbstractQueue<Integer> AQ = new LinkedBlockingQueue<Integer>(); 
  
        // Pop işlemi
        AQ.add(10); 
        AQ.add(20); 
        AQ.add(30); 
        AQ.add(40); 
        AQ.add(50); 
  
        System.out.println("AbstractQueue contains: " + AQ); 
  
        // Kuyruğun başındaki elemn
        System.out.println("Head: " + AQ.element()); 
  
        // Kuyruğu temizle
        AQ.clear(); 
        System.out.println("AbstractQueue: " + AQ); 
    } 
} 
/*OUTPUT
AbstractQueue contains: [10, 20, 30, 40, 50]
Head: 10
AbstractQueue: []
*/