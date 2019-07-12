package com.mert.javatutorial;

public class IfElse {
    public static void main(String[] args) {
        // Örnek 1
        int sayi1 = 3;
        if(sayi1>0){ // sayi1>0 koşulu true döneceği için
            int sayi2 = sayi1*5;
            System.out.println("sayi2 değeri : "+sayi2); 
        }//Ekran Çıktısı : sayi2 değeri :15


        // Örnek 2
        int sayi1 = 0;
        if(sayi>0){ // sayi1>0 koşulu false döneceği için
            int sayi2 = sayi1*5;
            System.out.println("sayi2 değeri : "+sayi2);
        }//Ekran Çıktısı olmayacaktır.


        // Örnek 3
        int sayi =85;
        if(sayi>=50&&sayi<60){
            System.out.println("sayı 50 ile 60 arasında");
        } else if(sayi>=60&&sayi<70){
            System.out.println("sayı 60 ile 70 arasında");
        } else if(sayi>=70&&sayi<80){
            System.out.println("sayı 70 ile 80 arasında");
        } else if(sayi>=80&&sayi<90){
            System.out.println("sayı 80 ile 90 arasında");
        } else if(sayi>=90&&sayi<100){
            System.out.println("sayı 90 ile 100 arasında");
        }//Ekran Çıktısı: sayı 80 ile 90 arasında
    }
}