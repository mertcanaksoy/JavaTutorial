package com.mert.javatutorial;

//Örnek 1:
class Addition {

    int sum = 0; 
      
    public int addTwoInt(int a, int b){
        sum = a + b; 
        return sum; 
    }  
} 

public class Test{
    public static void main (String[] args) {
        Addition add = new Addition();
        int sum = add.addTwoInt(5,10);
        System.out.println("Parametre olark verilen iki sayının toplamı: "+ sum);
    }
}


//Örnek 2:
import java.io.*; 
class Test  
{ 
    public static int i = 0;

    Test() 
    {
        i++;
    }

    public static int get(){
        return i;
    }

    public int m1(){
        System.out.println("m1, Main class'ta oluşturulan nesne tarafından çağırıldı");
        this.m2();
        return 1;
    }

    public void m2(){
        System.out.println("m2, m1 tarafından çağırıldı.");
    }
}

public class Main{
    public static void main(String[] args){
        Test test = new Test();

        int methoddanDonen = test.m1();
        System.out.println("m1 metodundan dönen değer: "+methoddanDonen);

        int nesneNumarasi = Test.get();
        System.out.print("Şimdiye kadar oluşturulan nesne sayısı: "+nesneNumarasi); 
    }
}