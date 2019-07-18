package com.mert.javatutorial;

interface IOne{
    void mOne();
}

interface ITwo{
    void mTwo();
}

class Sample implements IOne, ITwo{
    @Override
    public void mOne(){
        System.out.println("mOne metodu çağırıldı");
    }

    @Override
    public void mTwo(){
        System.out.println("mTwo metodu çağırıldı");
    }
}

class Test{
    public static void main(String[] args){
        Sample sample = new Sample();

        sample.mOne();
        sample.mTwo();
    }
}
/*OUTPUT
mOne metodu çağırıldı
mTwo metodu çağırıldı
*/

interface IOne{
    void mOne();
}

interface ITwo{
    void mTwo();
}

interface IThree extends IOne, ITwo{
    void mThree();
}

public class Test implements IThree{
    public void mOne(){
        System.out.println("mOne metodu çağırıldı.");
    }
    public void mTwo(){
        System.out.println("mTwo metodu çağırıldı.");
    }
    public void mThree(){
        System.out.println("mThree metodu çağırıldı.");
    }
    
    
    public static void main(String[] args){
        Test test = new Test();
        test.mOne();
        test.mThree();
        test.mTwo();
    }
}
/*OUTPUT
mOne metodu çağırıldı.
mThree metodu çağırıldı.
mTwo metodu çağırıldı.
*/