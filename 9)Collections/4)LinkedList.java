package com.mert.javatutorial;
import java.util.*; 
  
public class Test 
{ 
    public static void main(String args[]) 
    { 
        // Linked list (Bağlı liste) sınıfından obje türet
        LinkedList<String> object = new LinkedList<String>(); 
  
        // Elemanları Bağlı listeye ekle 
        object.add("A"); 
        object.add("B"); 
        object.addLast("C"); 
        object.addFirst("D"); 
        object.add(2, "E"); 
        object.add("F"); 
        object.add("G"); 
        System.out.println("Linked list : " + object); 
  
        // Listeden eleman sil 
        object.remove("B"); 
        object.remove(3); 
        object.removeFirst(); 
        object.removeLast(); 
        System.out.println("Linked list after deletion: " + object); 
  
        // Listedeki elemanları bul
        boolean status = object.contains("E"); 
  
        if(status) 
            System.out.println("List contains the element 'E' "); 
        else
            System.out.println("List doesn't contain the element 'E'"); 
  
        // Eleman sayısı 
        int size = object.size(); 
        System.out.println("Size of linked list = " + size); 
  
        // Elemanlara get ve set uygula
        Object element = object.get(2); 
        System.out.println("Element returned by get() : " + element); 
        object.set(2, "Y"); 
        System.out.println("Linked list after change : " + object); 
    } 
}
/*OUTPUT
Linked list : [D, A, E, B, C, F, G]
Linked list after deletion: [A, E, F]
List contains the element 'E' 
Size of linked list = 3
Element returned by get() : F
Linked list after change : [A, E, Y]
*/