package com.mert.javatutorial;

//1: Soyut bir sınıf örneği oluşturulamaz, ancak soyut sınıf türüne ait referanslarımız olabilir. (Base base = new Derived() buraya dikkat edilmeli)
abstract class Base{
    abstract void fonk();
}

class Derived extends Base{
    void fonk(){
        System.out.println("Abstract sınıftan türetilmiş metod çağırıldı.");
    }
}

public class Test{
    public static void main(String args[]) {
        Base base = new Derived();
        base.fonk();
    }
}
/*OUTPUT
Abstract sınıftan türetilmiş metod çağırıldı.
*/


//2: Soyut sınıflar, constructor method içerebilir. Türetilen sınıfın nesnesi oluşturulunca bu temel soyut sınıftaki constructor çağırılır.
abstract class Base { 
    Base() { System.out.println("Base Constructor Called"); } 
    abstract void fun(); 
} 
class Derived extends Base { 
    Derived() { System.out.println("Derived Constructor Called"); } 
    void fun() { System.out.println("Derived fun() called"); } 
} 
public class Main { 
    public static void main(String args[]) {  
       Derived d = new Derived(); 
    } 
} 
/*OUTPUT
Base Constructor Called
Derived Constructor Called
*/


//3: Abstract method bulunmayan abstract sınıflar oluşturulabilir. (Somutlaştırılamayan ancak miras alınılabilen sınıflar oluşturulabilir)
abstract class Base {    
    void fun() { System.out.println("Base fun() called"); } 
} 
   
class Derived extends Base { } 
   
public class Main { 
    public static void main(String args[]) {  
        Derived d = new Derived(); 
        d.fun(); 
    } 
} 
/*OUTPUT
Base fun() called
*/

//4: Abstract sınıflar final methodlara da sahip olabilir.
abstract class Base {    
    final void fun() { System.out.println("Base fun() called"); } 
} 
   
class Derived extends Base { } 
   
public class Main { 
    public static void main(String args[]) {  
        Derived d = new Derived(); 
        d.fun(); 
    } 
}
/*OUTPUT
Base fun() called
*/