package com.mert.javatutorial;
import java.io.*; 
import java.util.*; 
  
public class ArrList 
{ 
    public static void main(String[] args) throws IOException 
    { 
       
        int n = 5; 
        //n elemanlı bir ArrayList tanımla
        ArrayList<Integer> arrList = new ArrayList<Integer>(n);

        //Listenin sonuna yeni eleman ekle
        for (int i=1; i<=n; i++) 
            arrList.add(i); 
        System.out.println(arrList); 

        //3. indexteki elemanı sil
        arrList.remove(3); 
        System.out.println(arrList); 
        for (int i=0; i<arrList.size(); i++) 
            System.out.print(arrList.get(i)+" "); 
    } 
}
/*OUTPUT
[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5
*/