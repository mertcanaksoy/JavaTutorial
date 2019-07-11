package com.mert.javatutorial;
public class Person{
    String name;
    int age;
    String city;
    
    public Person(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;   
    }
    
    public String getName() 
    { 
        return name; 
    } 
    
    public int getAge() 
    { 
        return age; 
    } 
    
    public String getCity() 
    { 
        return city; 
    } 
    
    public String toString(){
        return ("Merhaba, benim adım "+this.getName()+". " + this.getAge() + " yaşındayım ve "+this.getCity()+" şehrinde yaşıyorum.");
    }
    
    public static void main(String args[]){
        Person person = new Person("Mert",20,"İstanbul");
        System.out.println(person.toString());
    }
}
