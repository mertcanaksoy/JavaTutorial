package com.mert.javatutorial;

class Singleton{
    private static Singleton singletonInstance=null;
    public String str;

private Singleton(){
    str="Singleton class'ının stringi";
}
public static Singleton getInstance(){
    if(singletonInstance == null){
        singletonInstance = new Singleton();
    }
    return singletonInstance;

}
}

public class Main{
    public static void Main(String[] args){
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        x.str = (x.str).toUpperCase();

        System.out.println("String from x is " + x.str); 
        System.out.println("String from y is " + y.str); 
        System.out.println("String from z is " + z.str); 
        System.out.println("\n"); 

        z.str = (z.str).toLowerCase(); 
  
        System.out.println("String from x is " + x.str); 
        System.out.println("String from y is " + y.str); 
        System.out.println("String from z is " + z.str); 
    }
}
/*OUTPUT
x'ten gelen string: SINGLETON CLASS'ININ STRINGI
y'den gelen string: SINGLETON CLASS'ININ STRINGI
z'den gelen string: SINGLETON CLASS'ININ STRINGI


x'ten gelen string: singleton class'inin stringi
y'den gelen string: singleton class'inin stringi
z'den gelen string: singleton class'inin stringi
*/