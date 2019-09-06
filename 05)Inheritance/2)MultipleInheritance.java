package com.mert.javatutorial;

interface IMultiple1{
    default void show(){
        System.out.println("Default IMultiple1");
    }
}

interface IMultiple2{
    default void show(){
        System.out.println("Default IMultiple2");
    }
}

class Test implements IMultiple1, IMultiple2{
    //default show() metodunu override ediyor
    public void show(){
        IMultiple1.super.show();
        IMultiple2.super.show();
    }

    public static void main(String args[]){
        Test test = new Test();
        test.show();
    }
}
/*OUTPUT
Default IMultiple1
Default IMultiple2
*/