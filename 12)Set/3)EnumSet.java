package com.mert.javatutorial;
import java.util.EnumSet; 
     
enum EnumSetExample  
{ 
    MATH, PHYSICS, BIOLOGY, CHEMISTRY, COMPUTER 
}; 
public class Example 
{ 
    public static void main(String[] args)  
    { 
        // Set oluştur
        EnumSet<EnumSetExample> set1, set2, set3, set4; 
  
        set1 = EnumSet.of(EnumSetExample.MATH, EnumSetExample.PHYSICS, EnumSetExample.BIOLOGY, EnumSetExample.CHEMISTRY);  //seçilenler
        set2 = EnumSet.complementOf(set1); //set1'in tamamlayıcısı
        set3 = EnumSet.allOf(EnumSetExample.class);  //tüm set
        set4 = EnumSet.range(EnumSetExample.MATH, EnumSetExample.BIOLOGY); //Belli bir aralık
        System.out.println("Set 1: " + set1); 
        System.out.println("Set 2: " + set2); 
        System.out.println("Set 3: " + set3); 
        System.out.println("Set 4: " + set4); 
    } 
}
/*OUTPUT
Set 1: [MATH, PHYSICS, BIOLOGY, CHEMISTRY]
Set 2: [COMPUTER]
Set 3: [MATH, PHYSICS, BIOLOGY, CHEMISTRY, COMPUTER]
Set 4: [MATH, PHYSICS, BIOLOGY]
*/