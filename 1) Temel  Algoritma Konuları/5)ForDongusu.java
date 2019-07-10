/*
İstenen deyim(ler)in kaç kez tekrarlanacağı biliniyorsa for döngüsü kullanılabilir. Yazımı şu şekildedir;
for (sayacın_ilk_değeri; tekrarlama_koşulu; sayaç_değerinin_değişimi){
      İçeride yapılacak işlemler
  }
   
*/
package com.mert.javatutorial;
public class ForDongusu {
    public static void main(String args[]){

        //Örnek 1: 1'den 10'a kadar sayıları ekrana yazdıracak döngü
        for(int i=1; i=<10; i++){
            System.out.println(i);
        }
       
       //Örnek 2: 1'den 10'a kadar çift sayıları ekrana yazdıracak döngü
        for(int i=1; i=<10; i+=2){
            System.out.println(i);
        }

        //Örnek 3: 1'den 10'a kadar sayıların tümünün toplamını bulan döngü
        int n, toplam;
        int i;

        n = 10;
        toplam = 0;

        for (i = 1; i <= n; i++) {
            toplam += i;
        }
        System.out.println("\n1+2+3+..+" + n + "=" + toplam);

        //Örnek 4: İç içe for döngüsü örneği. Burada *'lar ile bir dik üçgen çizilmektedir.
        for(int satir = 0; satir < 10; satir++){ // 1.  For Döngüsü (Dış Döngü)
            System.out.print("*");
            for(int sutun = 0; sutun < satir; sutun++){ // 2. For Döngüsü (İç Döngü)
                System.out.print("*");
                } // İç döngü sonu
            System.out.print("\n"); // bu kod çıktıda  satır atlatmak için
        } // Dış döngü sonu


        //Örnek 5: Bir dizinin içindeki en büyük elemanı bulan döngü (Diziler konusuna ayrıca değinilecektir)
        int enBuyuk=0;
        int[] dizi = {71,45,26,41,152,90,88};
        
        enBuyuk = dizi[0];
        for (int i = 0; i < dizi.length; i++){
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        System.out.println("Dizideki en büyük değer: " + enBuyuk);
    }
}
