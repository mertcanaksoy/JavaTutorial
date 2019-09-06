/*
do-while deyiminde, test koşulunun döngünün sonunda olmasıdır. Bunun anlamı, Koşul yanlış olsa dahil, gövde en az 1 kez çalışacaktır. 
Ancak gövdeyi en az bir kere çalıştırmamız gereken durumlar vardır.
*/
package com.mert.javatutorial;
public class DoWhile {
    public static void main(String args[]){

        //Örnek 1: Burada while ve do-while arasındaki fark, tek örnekle gösterilmiştir. While döngüsü çalışmayacaktır ancak do-while döngüsü, 1 defa da olsa çalışacaktır.
        int count = 10;
        while(count < 10) {
            System.out.println("While: " + count);
            count++;
        }
         
        int doCount = 10;
        do{
            System.out.println("Do-While: " + doCount);
            doCount++;
        } while(doCount < 10);
    }
}
