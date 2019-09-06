package com.mert.javatutorial;

//1. Aynı tipte 2 değerin döndürülmesi
public class Test{
    static int[] getSumAndSub(int a, int b){
        int[] sonuc = new int[2];
        sonuc[0] = a+b;
        sonuc[1] = a-b;

        return sonuc;
    }

    public static void main(String[] args){
        int[] cevap = getSumAndSub(20,10);
        System.out.println("Toplama işlemi sonucu: "+cevap[0]);
        System.out.println("Çıkarma işlemi sonucu: "+cevap[1]);
    }
}

//2. Aynı tipte 2'den fazla değerin döndürülmesi
class MulDivAdd{
    int mul;
    double div;
    int add;
    MulDivAdd(int m, double d, int a){
        mul=m;
        div=d;
        add=a;
    }
}

public class Test{
    static MulDivAdd getMulDivAdd(int a, int b){
        return new MulDivAdd(a*b,(double)a/b,(a+b));
    }

    public static void main(String[] args){
        MulDivAdd sonuc = getMulDivAdd(50,100);
        System.out.println("Çarpma: "+ sonuc.mul);
        System.out.println("Bölme: "+ sonuc.div);
        System.out.println("Toplama: "+ sonuc.add);
    }
}


//3. Object sınıfından liste döndürme
import java.util.*; 
public class Test{
    public static List<Object> getDetails(){
        String name = "Mert"; 
        int age = 20; 
        char gender = 'E'; 

        return Arrays.asList(name,age,gender);
    }
    
    public static void main(String[] args){
        List<Object> person = getDetails();
        System.out.println(person);
    }
}