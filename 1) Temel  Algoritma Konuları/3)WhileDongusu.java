/*
Döngüsel işlem veya tekrarlı işlem (iterasyon, İng. iteration), bilgisayarı aynı işlem grubunu belirli bir 
koşul sağlanana kadar tekrar tekrar yapmak için yönlendirir. Java dilinde döngü yapısını oluşturmak için kullanılabilir
*/
package com.mert.javatutorial;
public class WhileDongusu {
    public static void main(String args[]){

        //Örnek 1: Burada 1'den 10'a kadar olan sayıların toplamını tke bir satırda yazdıran program yazılmıştır.
        int toplam = 0;
        int i = 0;
        while (i < 10){
            toplam = toplam + i;
            i++;
        }
        System.out.println("Toplam : "+toplam);


        //Örnek 2: Burada 1'den 10'a kadar olan sayıların faktoriyellerini alıp ayrı ayrı satırlara yazdıran program yazılmıştır.
        int faktoriyel=1;
        int carpan=1;
        while(carpan<=10) {
            faktoriyel=faktoriyel*carpan;
            System.out.println(carpan+" faktoriyel = "+faktoriyel);
            carpan++;
        }
    }
}
