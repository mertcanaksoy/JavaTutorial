package com.mert.javatutorial;
import java.util.LinkedList; 
import java.util.Queue; 
  
public class QueueExample 
{ 
  public static void main(String[] args) 
  { 
    Queue<Integer> q = new LinkedList<>(); 
  
    // {0, 1, 2, 3, 4} elemanlarını kuyruğa ekle
    for (int i=0; i<5; i++) 
     q.add(i); 
  
    // Kuyruğun içeriğini görüntüle 
    System.out.println("Elements of queue: "+q); 
  
    // Kuyruğun başından eleman sil 
    int removedele = q.remove(); 
    System.out.println("Removed element: " + removedele); 
  
    System.out.println("Elements of queue: "+q); 
  
    // Kuyruğun başını görüntüle
    int head = q.peek(); 
    System.out.println("Head of queue: " + head); 
  
    // Kuyruğun boyutu
    int size = q.size(); 
    System.out.println("Size of queue: " + size); 
  } 
}
/*OUTPUT
lements of queue: [0, 1, 2, 3, 4]
Removed element: 0
Elements of queue: [1, 2, 3, 4]
Head of queue: 1
Size of queue: 4
*/