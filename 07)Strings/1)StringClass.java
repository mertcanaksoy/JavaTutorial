package com.mert.javatutorial;
import java.io.*; 
import java.util.*; 
public class Test{
    public static void main (String[] args) 
    {
        String s = "StringDeneme";
        System.out.println("String length = " + s.length());
        System.out.println("Character at 5th position = "+ s.charAt(5)); 
        System.out.println("Substring (5) = " + s.substring(5)); 
        System.out.println("Substring (6,10) = " + s.substring(6,10));
        
        String s1 = "String"; 
        String s2 = "Deneme"; 
        System.out.println("Concatenated string  = " + s1.concat(s2)); 
        
        String s3 = "Java ile String İşlemleri"; 
        System.out.println("Index of String: " +  s3.indexOf("String")); 
        
        Boolean out = "Deneme".equals("deneme"); 
        System.out.println("Checking Equality: " + out); 
        out = "Deneme".equals("Deneme"); 
        System.out.println("Checking Equality: " + out); 
       
        String word1 = "Java ile String İşlemleri"; 
        System.out.println("Changing to lower Case: " + word1.toLowerCase()); 
        String word2 = "Java ile String İşlemleri"; 
        System.out.println("Changing to UPPER Case :" + word1.toUpperCase()); 
        
        String word4 = " Baştaki ve sondaki boşluklar gitsin "; 
        System.out.println("Trim the word: " + word4.trim());
    }
}
/*OUTPUT
String length = 12
Character at 5th position = g
Substring (5) = gDeneme
Substring (6,10) = Dene
Concatenated string  = StringDeneme
Index of String: 9
Checking Equality: false
Checking Equality: true
Changing to lower Case: java ile string i̇şlemleri
Changing to UPPER Case :JAVA ILE STRING İŞLEMLERI
Trim the word: Baştaki ve sondaki boşluklar gitsin
*/