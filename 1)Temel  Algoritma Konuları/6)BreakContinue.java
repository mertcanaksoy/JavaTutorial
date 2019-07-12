/*
break deyiminin Java programları içinde iki farklı kullanım alanı vardır:

switch yapısındaki case seçeneklerinden birinde switch yapısını terk etmek ve switch’i izleyen deyime geçmek için kullanılır.
Bir döngü (loop) yapısı içinden, döngüyü kontrol eden koşul ifadesini beklemeksizin döngü dışına çıkmak için kullanılır.
break deyimi bir döngü içinde yer almışsa bu durumda break deyimi ile karşılaşır karşılaşmaz döngü dışına çıkılır ve döngüyü izleyen deyime geçilir.

Continue deyimi, break deyiminden farklı olarak döngüyü sonlandırmamakta fakat döngüde ilgili tekrarı atlamaktadır (es geçmektedir). 
*/

package com.mert.javatutorial;
public class BreakContinue {
    public static void main(String args[]){

        //Break örneği
        int sayi = 25;
        int i = 1;
        while(sayi >= 0) {
            System.out.println(i + ". sayı");
            if(i == 15) {
                break;
            }
            i++;
            sayi--;
        } //if(i==15) koşulu gerçekleşince break komutu devreye giriyor ve 25'e kadar ilerlemesi gereken döngü sona eriyor.


        //Continue örneği
        int sayi = 25;
        for(int i =1; i<=sayi; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i + ". sayı");
        } //if(i==5) koşulu gerçekleşince continue komutu devreye giriyor ve döngünün sonundaki yazdırma komutuna ulaşamadan tekrar başa dönüyor.
    }
}
