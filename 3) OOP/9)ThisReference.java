package com.mert.javatutorial;

//Kullanım 1: Mevcut sınıf örneği değişkenlerini belirtmek için
public class Test{
    int a;
    int b;
      
    Test(int a, int b){
        this.a = a;
        this.b = b;
    }
  
    void display(){
        System.out.println("a = " + a + "  b = " + b);
    }
  
    public static void main(String[] args){
        Test object = new Test(10, 20);
        object.display();
    }
}

//Kullanım 2: Mevcut sınıf kurucusunu çağırmak için
public class Test{
    int a;
    int b;

    //Constructor
    Test()
    {
        this(10, 20);
        System.out.println("Default Constructor Bloğu Çalıştı");
    }

    //Parametreli Constructor
    Test(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Parametreli Constructor Bloğu Çalıştı");
    }

    public static void main(String[] args)
    { 
        Test object = new Test();
    }
}


//Kullanım 3: Mevcut sınıf örneğini döndürmek için
public class Test
{ 
    int a;
    int b;
  
    //Default constructor
    Test()
    {
        a = 10;
        b = 20;
    }
      
    //Mevcut sınıfın öğelerini döndüren method
    Test get()
    {
        return this;
    }
      
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    } 
  
    public static void main(String[] args)
    {
        Test object = new Test();
        object.get().display();
    }
} 


// Kullanım 4: Mevcut sınıfın bir metodunu çağırmak için
public class Test { 
  
    void display()
    { 
        // calling fuction show()
        this.show();
     
       System.out.println("Inside display function");
    } 
      
    void show() {
        System.out.println("Inside show funcion");
    } 
      
  
    public static void main(String args[]) {
        Test t1 = new Test();
        t1.display();
    } 
}

