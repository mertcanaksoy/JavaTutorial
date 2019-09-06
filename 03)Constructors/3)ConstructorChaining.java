package com.mert.javatutorial;

//Kullanım 1: this() keyword'ü ile
public class Test 
{ 
    // default constructor 1 
    // default constructor this keyword'ü ile diğer constructor'ı çağırır
    Test() 
    { 
        // calls constructor 2 
        this(5); 
        System.out.println("Default constructor"); 
    } 
  
    // Tek Parametreli constructor 2
    Test(int x) 
    { 
        // İki parametreli constructor 3'ü çağırır
        this(5, 10); 
        System.out.println(x); 
    } 
  
    // İki parametreli constructor 3 
    Test(int x, int y) 
    { 
        System.out.println(x + y); 
    } 
  
    public static void main(String args[]) 
    { 
        // Main progrmda 1 numarlı constructor çağırılır ve sonuç aşağıdaki gibi olur
        new Test(); 
    } 
} 
/*OUTPUT
15
5
Default constructor
*/
//Özetle Stack mantığı ile son çağrılan constructor, ilk ekran çıktısını veriyor


//Kullanım 2: this() keyword'ü ile tersten
public class Test 
{ 
    // default constructor 1 
    Test() 
    { 
        System.out.println("Default constructor"); 
    } 
  
    Test(int x) 
    { 
        this(); 
        System.out.println(x); 
    } 
  
    Test(int x, int y) 
    { 
        this(5); 
        System.out.println(x * y); 
    } 
  
    public static void main(String args[]) 
    { 
        new Test(8, 10); 
    } 
} 
/*OUTPUT
Default constructor
5
80
*/
//NOT: 1. Örneğin tam tersi olarak çağırılma sırası 3-2-1 olarak şekildedir ancak mantık aynı. Yine son çağrılan ilk yazdırılır.



//Kullanım 3: super() keyword'ü ile

class Base{
    String name;

    Base(){ //Ctor 1
        this("");
        System.out.println("Base sınıfından parametresiz constructor çağırıldı");
    }

    Base(String name){ //Ctor 2
        this.name=name;
        System.out.println("Base sınıfından parametreli constructor çağırıldı");
    }
}

public class Derived extends Base{
    Derived(){ //Ctor 3
        System.out.println("Derived(Türetilmiş) sınıfından parametresiz constructor çağırıldı");
    }

    Derived(String name){ //Ctor 4
        super(name);
        System.out.println("Derived(Türetilmiş) sınıfından parametreli constructor çağırıldı");
    }

    public static void main(String args[]){
        Derived derived = new Derived("Deneme"); //Ctor 4 çağırılır
    }

}

//Kullanım 4: init blou ile
public class Temp 
{ 
    { 
        System.out.println("init block"); 
    } 
  
    Temp(){ 
        System.out.println("default"); 
    } 
   
    Temp(int x){ 
        System.out.println(x); 
    } 
  
    public static void main(String[] args){ 
        new Temp();
        new Temp(10);
    } 
} 