package com.mert.javatutorial;

//1:

interface IPrint{
    static void print(){
        System.out.println("Called from IPrint interface");
    }
}

public class Test implements IPrint{
     public static void main(String[] args){
         IPrint.print(); //Interface'ten çağırıldı
         print(); //Sınıfın içinden çağırıldı
     }

     static void print(){
         System.out.println("Called from this class");
     }
}
/*OUTPUT
Called from IPrint interface
Called from this class
*/


//2