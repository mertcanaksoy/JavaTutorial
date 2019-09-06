package com.mert.javatutorial;

class Box{
    double width, height, depth;

    Box(){
        width=height=depth=1;
    }

    Box(double lenght){
        width=height=depth=lenght;
    }

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume(){
        return width*height*depth;
    }
}

public class Test{
    public static void main(String args[]){
        Box box1 = new Box(5,10,20);
        Box box2 = new Box(20);
        Box box3 = new Box();

        double volume;

        volume = box1.volume();
        System.out.println("Box1 Hacmi: " + volume); 
        volume = box2.volume();
        System.out.println("Box2 Hacmi: " + volume); 
        volume = box3.volume();
        System.out.println("Box3 Hacmi: " + volume); 
    }
}
/*OUTPUT
Box1 Hacmi: 1000.0
Box2 Hacmi: 8000.0
Box3 Hacmi: 1.0
*/