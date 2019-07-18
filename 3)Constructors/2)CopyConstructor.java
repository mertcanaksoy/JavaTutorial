package com.mert.javatutorial;

class Complex{
    
    private double reel,imaginary;
    
    public Complex(double reel, double imaginary){
        this.reel = reel;
        this.imaginary = imaginary;
    }
    
    Complex(Complex copy){
        System.out.println("Copy Constructor has called");
        reel = copy.reel;
        imaginary = copy.imaginary;
    }
    
    @Override
    public String toString() { 
        return "(" + reel + " + " + imaginary + "i)"; 
    } 
    
}

public class Main { 
  
    public static void main(String[] args) { 
        Complex c1 = new Complex(5,10);
        Complex c2 = new Complex(c1);
        Complex c3 = c2;
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    
}
/*OUTPUT
Copy Constructor has called
(5.0 + 10.0i)
(5.0 + 10.0i)
(5.0 + 10.0i)
*/