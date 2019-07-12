package com.mert.javatutorial;
class Vehicle{
    public int gear;
    public int speed;
    
    //Constructor
    public Vehicle(int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }

    //Hızlan
    public void speedUp(int increment){
        speed+=increment;
    }
    
    //Fren uygula
    public void applyBrake(int decrement){
        speed-=decrement;
    }
    
    public String toString(){
        return("Vites: "+ gear+" Hız: "+speed);
    }
}


class Truck extends Vehicle{
    public int wheelCount;

    //Constructor
    public Truck(int gear, int speed, int inputWheelCount){
        super(gear,speed); //miras alınan sınıftan çekilen alanlar
        wheelCount=inputWheelCount;
    }

    public void setWheelCount(int newCount){
        wheelCount=newCount;
    }

    @Override
    public String toString(){
        return (super.toString()+" Tekerlek sayısı: "+wheelCount);
    }
}

public class Test{
    public static void main(String args[]){
        Truck truck = new Truck(5,80,10);
        System.out.println(truck.toString());
    }
}
