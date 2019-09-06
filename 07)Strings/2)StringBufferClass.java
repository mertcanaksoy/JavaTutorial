package com.mert.javatutorial;

import java.io.*; 
public class Test{
    public static void main(String[] args) 
    { 
        StringBuffer str = new StringBuffer("StringBuffer"); 
        str.append("Class"); 
        System.out.println(str);
        str.append(101); 
        System.out.println(str);
        
        StringBuffer s = new StringBuffer("StringBuffer"); 
        s.insert(6, "/-/"); 
        System.out.println(s);
  
        s.insert(0, 101); 
        System.out.println(s);
  
        s.insert(3, true); //boolean
        System.out.println(s);
  
        char buff_arr[] = { 'a', 'r', 'r', 'a', 'y' }; 
  
        s.insert(3, buff_arr); 
        System.out.println(s);

        StringBuffer s1 = new StringBuffer("StringBufferExample"); 
        s1.delete(0, 6); 
        System.out.println(s1); 
        s1.deleteCharAt(7); 
        System.out.println(s1);

        StringBuffer s2 = new StringBuffer("StringBufferExample"); 
        s2.replace(6, 12, "------"); 
        System.out.println(s2);
    } 
}
/*OUTPUT
StringBufferClass
StringBufferClass101
String/-/Buffer
101String/-/Buffer
101trueString/-/Buffer
101arraytrueString/-/Buffer
BufferExample
BufferEample
String------Example
*/