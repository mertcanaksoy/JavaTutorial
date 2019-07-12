package com.mert.javatutorial;

class FirstClass{
    void m1(){
        System.out.println("m1 method inside FirstClass");
    }
}

class SecondClass extends FirstClass{
    //Overriding m1()
    void m1(){
        System.out.println("m1 method inside SecondClass");
    }
}

class ThirdClass extends FirstClass{
    //Overriding m1()
    void m1(){
        System.out.println("m1 method inside ThirdClass");
    }
}


public class Test{
    public static void main(String[] args){
        //Bütün sınıflardan birer nesne oluşturalım
        FirstClass firstObject = new FirstClass();
        SecondClass secondObject = new SecondClass();
        ThirdClass thirdObject = new ThirdClass();

        FirstClass referenceObject;

        referenceObject=firstObject;
        referenceObject.m1();

        referenceObject=secondObject;
        referenceObject.m1();

        referenceObject=thirdObject;
        referenceObject.m1();

        //Tek bir referans obje ile 3 farklı sınıfın içindeki metodlara erişerek polymorphism prensibi uygulanmıştır.
    }
}