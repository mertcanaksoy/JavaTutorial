package com.mert.javatutorial;
import java.util.*; 
import java.util.AbstractCollection; 
  
public class AbstractCollectionDemo { 
    public static void main(String args[]) 
    {
        //ArrayList ile
        AbstractCollection<Object> abs = new ArrayList<Object>(); 
        abs.add("Java"); 
        abs.add("İle"); 
        abs.add("Abstract"); 
        abs.add("Collection"); 
        abs.add("Denemesi"); 
  
        System.out.println("AbstractCollection: " + abs+"\n"); 

        //TreeSet ile
        AbstractCollection<String> collection1 = new TreeSet<String>();
        collection1.add("Java");
        collection1.add("İle");
        collection1.add("TreeSet");
        collection1.add("Collection");
        collection1.add("Gerçeklemesi");
        System.out.println("collection1: "+collection1);

        AbstractCollection<String> collection2 = new TreeSet<String>();
        System.out.println("collection1: "+collection2);
        collection2.addAll(collection1);
        System.out.println("collection1: "+collection2);
        collection1.clear();
        System.out.println("collection1: "+collection1+ " => so and collection1 is empty? => " + collection1.isEmpty());



        

    }
}
/*OUTPUT
AbstractCollection: [Java, İle, Abstract, Collection, Denemesi]

collection1: [Collection, Gerçeklemesi, Java, TreeSet, İle]
collection1: []
collection1: [Collection, Gerçeklemesi, Java, TreeSet, İle]
collection1: [] => so and collection1 is empty? => true
*/