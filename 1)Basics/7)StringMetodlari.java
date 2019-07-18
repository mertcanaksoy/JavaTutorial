/*
break deyiminin Java programları içinde iki farklı kullanım alanı vardır:

switch yapısındaki case seçeneklerinden birinde switch yapısını terk etmek ve switch’i izleyen deyime geçmek için kullanılır.
Bir döngü (loop) yapısı içinden, döngüyü kontrol eden koşul ifadesini beklemeksizin döngü dışına çıkmak için kullanılır.
break deyimi bir döngü içinde yer almışsa bu durumda break deyimi ile karşılaşır karşılaşmaz döngü dışına çıkılır ve döngüyü izleyen deyime geçilir.

Continue deyimi, break deyiminden farklı olarak döngüyü sonlandırmamakta fakat döngüde ilgili tekrarı atlamaktadır (es geçmektedir). 
*/

package com.mert.javatutorial;
public class StringMetodlari {
    public static void main(String args[]){
        
        //1.length() metodu
        String _string = "Selam Java";
        System.out.println("Uzunluk " + _string.length());


        //2.substring() metodu
        String _string = "Selam Java";
        System.out.println(_string.substring(6, _string.length()));


        //3.indexOf() metodu
        String _string = "Selam Java";
        System.out.println(_string.substring(6, _string.length()));
        System.out.println("Java kelimesinin başlangıç indexi " + _string.indexOf("Java"));


        //4.equals-equalsIgnoreCase() metodu: bir string ifadenin, başka bir ifadeyle karşılaştırılması için kullanılır. Büyük-küçük hassasiyeti varsa equals() kullanılmalı
        String _string = "Selam Java";
        if (_string.equalsIgnoreCase("Selam jAVa"))
        System.out.println("İki string de aynı");


        //5.toUpperCase() metodu: Tüm harfleri büyütür
        String _string = "Selam Java";
        System.out.println("Kucuk harfler : " + _string.toLowerCase());


        //6.toLowerCase() metodu: Tüm harfleri küçültür
        String _string = "Selam Java";
        System.out.println("Kucuk harfler : " + _string.toLowerCase());
        
        
        //7.trim() metodu: String ifadenin başındaki ve sonundaki boşlukları siler
        String _string = "  Selam Java ";
        System.out.println("Bosluklar yok " + _string.trim());

        //8.split() metodu: split ifadesi, diziyi aldığı parametreye göre böler. Bu örnekte diziyi boşluk ifadesine gör ebölüyoruz.
        String _string = "Selam Java nasılsın?";
        String[] kelimeler = _string.split(" ");
        int boyut = kelimeler.length;
        
        for(int i=0;i<boyut;i++){
            System.out.println(kelimeler[i]);
        }
    
    }
}
