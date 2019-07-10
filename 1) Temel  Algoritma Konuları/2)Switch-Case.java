/*
Bir programda çok sayıda koşul kontrolü ve bunların sonucuna göre gerçekleştirilmesi gereken işlemler varsa, if-else yapıları ile akışın izlenmesi zorlaşabilir. 
Böyle durumlar genellikle switch deyiminin kullanılmasının gerekli olacağı durumlardır. switch deyimi, tek bir ifadenin değerine göre sınırsız 
sayıda çalıştırma yolu belirlemeyi sağlayan bir komuttur.
*/


package com.mert.javatutorial;
public class SwitchCase {
    public static void main(String[] args) {
        //Örnek 1
        int sayi = 7;
        String ayAdi = null;
        switch(sayi) {
            case 1:
                ayAdi = "Ocak";
                break;
            case 2:
                ayAdi = "Şubat";
                break;
            case 3:
                ayAdi = "Mart";
                break;
            case 4:
                ayAdi = "Nisan";
                break;
            case 5:
                ayAdi = "Mayıs";
                break;
            case 6:
                ayAdi = "Haziran";
                break;
            case 7:
                ayAdi = "Temmuz";
                break;
            case 8:
                ayAdi = "Ağustos";
                break;
            case 9:
                ayAdi = "Eylül";
                break;
            case 10:
                ayAdi = "Ekim";
                break;
            case 11:
                ayAdi = "Kasım";
                break;
            case 12:
                ayAdi = "Aralık";
                break;
            default:
                break;
        }
        //Ekranda Seçilen Ay: Temmuz yazcaktır.
        System.out.println("Seçilen Ay: " + ayAdi);

        //Örnek 2: Burada kullanıcının klavyeden bir değer girerek seçim yapması isteniyor ve buna göre bir çıktı veriyor.
        Scanner giris = new Scanner(System.in);
        int secim;
        System.out.println("Secim yapiniz (1 - 2 - 3)");
        secim=giris.nextInt();
        switch (secim) {
        case 1 :
            System.out.println("1 Seçildi");
            break;
        case 2 :
            System.out.println("2 Seçildi");
            break;
        case 3 :
            System.out.println("3 Seçildi");
            break;
        default :
            System.out.println("Hatali seçim! Yalnızca 1, 2 ya da 3'ü seçebilirsiniz.");
            break;
        }
    }
}
