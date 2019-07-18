package com.mert.javatutorial;

//Örnek 1:
class ObjectPass{
    int a,b;

    ObjectPass(int i, int j){
        a=i;
        b=j;
    }

    boolean equalTo(ObjectPass obj){
        return (obj.a == a && obj.b == b);
    }
}

public class Test{
    public static void main(String[] args){
        ObjectPass obj1 = new ObjectPass(50,100);
        ObjectPass obj2 = new ObjectPass(50,100);
        ObjectPass obj3 = new ObjectPass(50,150);

        System.out.println("obj1 == obj2: "+obj1.equalTo(obj2));
        System.out.println("obj1 == obj3: "+obj1.equalTo(obj3));
    }
}

//Örnek 2: Sınıfının nesnesini parametre olarak alan bir kurucu tanımlamak
class Box 
{ 
    double width, height, depth; 
    Box(Box ob) 
    { 
        width = ob.width; 
        height = ob.height; 
        depth = ob.depth; 
    }
    Box(double w, double h, double d) 
    { 
        width = w; 
        height = h; 
        depth = d; 
    }
    double volume() 
    { 
        return width * height * depth; 
    } 
} 


public class Test 
{ 
    public static void main(String args[]) 
    { 
        Box mybox = new Box(5, 10, 20); 
        Box myclone = new Box(mybox); 
  
        double vol; 
        vol = mybox.volume(); 
        System.out.println("Kutunun hacmi " + vol); 
        vol = myclone.volume(); 
        System.out.println("Klonlanan kutunun hacmi " + vol); 
    } 
} 

//Örnek 3: Bir nesne döndürmek
class ObjectReturn
{ 
    int a; 
    
    ObjectReturn(int i) 
    { 
        a = i; 
    } 
  
    ObjectReturn onEkle() 
    { 
        ObjectReturn temp = new ObjectReturn(a+10); 
        return temp; 
    } 
} 
  
public class Test 
{ 
    public static void main(String args[]) 
    { 
        ObjectReturn obj1 = new ObjectReturn(2); 
        ObjectReturn obj2; 
  
        obj2 = obj1.onEkle(); 
  
        System.out.println("obj1.a: " + obj1.a); //2
        System.out.println("obj2.a: " + obj2.a); //12
    } 
} 