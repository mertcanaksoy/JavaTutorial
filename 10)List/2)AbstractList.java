package com.mert.javatutorial;
import java.util.*; 
  
public class AbstractListDemo { 
    public static void main(String args[]) 
    { 
        //Boş bir AbstractList oluştur
        AbstractList<String> list = new LinkedList<String>();
        //add() metodu ile listeye elemanları ekle
        list.add("Java"); 
        list.add("ile"); 
        list.add("Listeler"); 
        list.add("101"); 
        list.add("201"); 
        System.out.println("AbstractList:" + list); 

        //1. indexteki elemanı sil
        list.remove(1);
        System.out.println("AbstractList:" + list); 

        int lastindex1 = list.lastIndexOf("A"); 
        System.out.println("Last index of A : "+ lastindex1);
        int lastindex2 = list.lastIndexOf("Listeler"); 
        System.out.println("Last index of Listeler : "+ lastindex2);
    } 
}
/*OUTPUT
AbstractList:[Java, ile, Listeler, 101, 201]
AbstractList:[Java, Listeler, 101, 201]
Last index of A : -1
Last index of Listeler : 1
*/