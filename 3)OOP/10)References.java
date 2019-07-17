package com.mert.javatutorial;

class Test 
{ 
    int x; 
    Test(int i) { x = i; } 
    Test()      { x = 0; } 
} 
  
public class Main 
{ 
    public static void main(String[] args) 
    { 
        Test t = new Test(5);
        change(t);
        System.out.println(t.x); 
    } 

    public static void change(Test t) 
    { 
        t.x = 10; //İlk oluşturulan adrese referans veren nesnenin değeri değiştirildi
    } 
} //Çıktı: 10


class Test 
{ 
    int x; 
    Test(int i) { x = i; } 
    Test()      { x = 0; } 
} 
  
public class Main 
{ 
    public static void main(String[] args) 
    { 
        Test t = new Test(5); 
        change(t);
        System.out.println(t.x); 
    } 
    public static void change(Test t) 
    { 
        t = new Test(); //Yeni bir nesne oluşturuldu
        t.x = 10; //Yeni oluşturulan nesnenin değeri değiştirildi
    } 
} //Çıktı: 5