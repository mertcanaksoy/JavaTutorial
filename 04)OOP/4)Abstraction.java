package com.mert.javatutorial;

abstract class Shape{
    String color;

    //Abstract metodlar
    abstract double area();
    public abstract String toString();

    //Constructor
    public Shape(String color){
        System.out.println("Shape Constructor called");
        this.color=color;
    }

    //Concrete metod
    public String getColor(){
        return color;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    //Constructor
    public Rectangle(String color, double width, double height){
        super(color); //Shape abstract sınıfının constructor çağırıldı
        System.out.println("Rectangle constructor called");
        this.width=width;
        this.height=height;
    }

    @Override
    double area(){
        return width*height;
    }

    @Override
    public String toString(){
        return "Rectangle's color: "+super.color+"\nArea: "+area();
    }
}


class Circle extends Shape{
    double radius;
    
    //Constructor
    public Circle(String color, double radius){
        super(color); //Shape constructor çağırıldı
        System.out.println("Circle constructor called\n");
        this.radius=radius;
    }

    @Override
    double area(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString(){
       return "Circle's color: "+super.color+"\nArea: "+area();
    }
    
}


public class Test{
    public static void main(String[] args){
        Shape s1= new Rectangle("Red",4,5);
        Shape s2=new Circle("Yellow",5);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}