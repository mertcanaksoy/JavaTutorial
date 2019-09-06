package com.mert.javatutorial;
public class GetNameClass 
{ 
    public static void main(String arr[]) 
    { 
        Object y; 
  
        y = 'A'; 
        System.out.println(y.getClass().getName()); 
  
        y = 1; 
        System.out.println(y.getClass().getName()); 
  
        y = "Hi"; 
        System.out.println(y.getClass().getName()); 
  
        y = 1.222; 
        System.out.println(y.getClass().getName()); 
  
        y = false; 
        System.out.println(y.getClass().getName()); 
    } 
} 

/* OUTPUT
java.lang.Character
java.lang.Integer
java.lang.String
java.lang.Double
java.lang.Boolean
*/