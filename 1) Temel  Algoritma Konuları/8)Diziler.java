/*
Tüm programlama dillerinde olduğu gibi Java dilinde de dizi (array) yapısı son derecede önemli bir veri yapısıdır.
Dizinin bir adı ve dizi içerisindeki elemanın dizinin kaçıncı elemanı olduğunu belirten bir indisi (index) vardır.
Java dilinde bir dizinin ilk elemanının indisi daima 0’dır; son elemanın indisi ise diziye ayrılan yer sayısının 1 eksiğine eşittir.
Dizi oluşturma formatı;
Tip[] DiziAdı = new Tip [ Eleman Sayısı ]; 
veya
Tip[] DiziAdı = {eleman1,eleman2...elemanx} 
*/

package com.mert.javatutorial;
public class Diziler {
    public static void main(String args[]){

        //Örnek 1
        int[] dizi = {10,5,20};
        System.out.println(dizi[0]); //Ekran çıktısı: 10
        System.out.println(dizi[1]); //Ekran çıktısı: 5
        System.out.println(dizi[2]); //Ekran çıktısı: 20


        //Örnek 2
        Scanner scan = new Scanner(System.in); 
        int sayi[] = new int[6]; 
        int toplam, i; toplam = 0; 
        for (i = 0; i < 5; i++) 
        { 
            System.out.print("Bir sayi giriniz: ");
            sayi[i] = scan.nextInt(); 
            toplam = toplam + sayi[i]; 
        } 
        System.out.println("Giilen Sayıların Toplamı " + toplam); 
        System.out.println("1 numaralı eleman: " + sayi[0]);
        System.out.println("3 numaralı eleman: " + sayi[2]);
         

        //Örnek 3
        int[][] matris={
                {213,621,913,1244},
                {155,224,2175,2485},
                {2791,310,3451,322},
                {4023,4234,775,501}
        };
        int i,j,k;
        k=0;
        int temp=0;
        int[] tekSayilar=new int[16];

        /*find the odd numbers*/
        for(i=0; i<=3; i++) {
            for(j=0; j<=3; j++) {
                if (matris[i][j]/2*2 != matris[i][j]) {
                    tekSayilar[k]=matris[i][j];
                    k++;
                }
                System.out.print("["+i+"]["+j+"]=" + matris[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Tek sayilardan olusan dizi:");
        for(i=0; i<=k-1; i++) {
            System.out.print(tekSayilar[i]+"\t");
        }
        System.out.println();
        System.out.println();

        /*tek sayılardan oluşan diziyi küçükten büyüğe olacak şekilde sıralayalım*/
        for(i=0; i<tekSayilar.length; i++) {
            for(j=0; j<tekSayilar.length; j++) {
                if(tekSayilar[i]>tekSayilar[j]) {
                    temp=tekSayilar[i];
                    tekSayilar[i]=tekSayilar[j];
                    tekSayilar[j]=temp;
                }
            }
        }    
        System.out.println("Tek sayilardan olusan dizinin siralanmis hali:");
        for(i=k-1; i>=0; i--) {
            System.out.print(tekSayilar[i]+"\t");
        }
    }
}
