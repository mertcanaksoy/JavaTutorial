package com.mert.javatutorial;


public class EncapsulationTest{
    public static void main (String[] args){
        Person person = new Person();

        //Set values
        person.setName("Mert");
        person.setRegion("İstanbul");
        person.setAge(20);

        //get values
        System.out.println("Name: "+person.getName());
        System.out.println("Region: "+person.getRegion());
        System.out.println("Age: "+person.getAge());
    }
}

public class Person{
    private String name;
    private String region;
    private int age;

    public String getName(){
        return name;
    }

    public String getRegion(){
        return region;
    }

    public int getAge(){
        return age;
    }

  	public void setName(String newName){
        name=newName;
    }
  
  	public void setRegion(String newRegion){
        region=newRegion;
    }  
  
    public void setAge(int newAge){
        age=newAge;
    }
}
