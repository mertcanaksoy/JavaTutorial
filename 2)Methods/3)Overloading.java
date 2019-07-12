package com.mert.javatutorial;

//Örnek 1:
public class Sum { 

    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
  
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
  
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.sum(10.5, 20.5)); 
    } 
}

//Örnek 2
class A {
    public int fonk(int a) { return 10; }
  
    public char fonk(int a, int b) { return 'a'; }
}
  
public class Main {
  
    public static void main(String args[])
    {
        A a = new A();
        System.out.println(a.fonk(1));
        System.out.println(a.fonk(1, 2));
    } 
} 