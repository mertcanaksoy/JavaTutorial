package com.mert.javatutorial;
public class Test 
{ 
    public static void main(String[] args) 
    { 
        System.out.print("String array default values: "); 
        String str[] = new String[5]; 
        for (String s : str) 
            System.out.print(s + " "); 
  
        System.out.print("\n\nInteger array default values: "); 
        int num[] = new int[5]; 
        for (int val : num) 
             System.out.print(val + " "); 
  
        System.out.print("\n\nDouble array default values: "); 
        double dnum[] = new double[5]; 
        for (double val : dnum) 
            System.out.print(val + " "); 
  
        System.out.print("\n\nBoolean array default values: "); 
        boolean bnum[] = new boolean[5]; 
        for (boolean val : bnum) 
            System.out.print(val + " "); 
  
        System.out.print("\n\nReference Array default values: "); 
        Test test[] = new Test[5]; 
        for (Test val : test) 
            System.out.print(val + " "); 
    } 
} 
/*OUTPUT
String array default values: null null null null null 

Integer array default values: 0 0 0 0 0 

Double array default values: 0.0 0.0 0.0 0.0 0.0 

Boolean array default values: false false false false false 

Reference Array default values: null null null null null 
*/