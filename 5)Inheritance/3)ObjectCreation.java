package com.mert.javatutorial;

class Fruit{
    public Fruit(){
        System.out.println("Super class constructor"); 
        System.out.println("Super class object hashcode:" + this.hashCode()); 
        System.out.println(this.getClass().getName()); 
    }
}

class Apple extends Fruit 
{ 
    public Apple(){
         System.out.println("Subclass constructor invoked"); 
        System.out.println("Sub class object hashcode: " +  this.hashCode()); 
        System.out.println(this.hashCode() + "   " +  super.hashCode()); 
  
        System.out.println(this.getClass().getName() + "  " + super.getClass().getName()); 
    }
}

public class Test 
{ 
    public static void main(String[] args) 
    { 
        Apple myApple = new Apple(); 
    } 
} 
/*OUTPUT
Super class constructor
Super class object hashcode:1829164700
Apple
Subclass constructor invoked
Sub class object hashcode: 1829164700
1829164700   1829164700
Apple  Apple
*/