package com.mert.javatutorial;
interface ITest{
    final int sample = 10;
    void show();
}

public class Test implements ITest{
    public void show(){
        System.out.println("İmplementasyon başarılı"); 
    }

    public static void main(String args[]){
        Test test = new Test();
        test.show();
        System.out.println("sample değişkeninin değeri: "+sample);
    }
}
/*OUTPUT
İmplementasyon başarılı
sample değişkeninin değeri: 10
*/


interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void speedDown(int a);
}

class Truck implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear=newGear;
    }

    @Override
    public void speedUp(int increment){
        speed=speed+increment;
    }

    @Override
    public void speedDown(int decrement){
        speed=speed-decrement;
    }

    public void showState() { 
         System.out.println("speed: " + speed + " gear: " + gear); 
    } 
}

class Bus implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear=newGear;
    }

    @Override
    public void speedUp(int increment){
        speed=speed+increment;
    }

    @Override
    public void speedDown(int decrement){
        speed=speed-decrement;
    }

    public void showState() { 
         System.out.println("speed: " + speed + " gear: " + gear); 
    } 
}

public class Test{
    public static void main(String args[]){
        Truck truck = new Truck();
        truck.changeGear(5);
        truck.speedUp(20);
        truck.speedDown(10);
        System.out.println("Truck için son durum:");
        truck.showState();

        Bus bus = new Bus();
        bus.changeGear(6);
        bus.speedUp(60);
        bus.speedDown(20);
        System.out.println("Bus için son durum:");
        bus.showState();
    }
}
/*OUTPUT
Truck için son durum:
speed: 10 gear: 5
Bus için son durum:
speed: 40 gear: 6
*/