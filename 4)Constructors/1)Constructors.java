package com.mert.javatutorial;

//1: Parametresiz Constructor

class Person 
{ 
    int id; 
    String name; 
   
    Person() 
    { 
        System.out.println("Constructor called"); 
    } 
} 
  
public class Test 
{ 
    public static void main (String[] args) 
    { 
        Person person1 = new Person(); 
        System.out.println(person1.name); 
        System.out.println(person1.id); 
    } 
} 
/*OUTPUT
Constructor called
null
0
*/


//2: Parametreli Constructor
  
class Person 
{ 
    String name; 
    int id; 
    Person(String name, int id) 
    { 
        this.name = name; 
        this.id = id; 
    } 
} 
  
public class Test 
{ 
    public static void main (String[] args) 
    { 
        Person person1 = new Person("Mert", 1); 
        System.out.println("Person Name:" + person1.name); 
        System.out.println("Person ID:" + person1.id);
    } 
} 
/*OUTPUT
Person Name:Mert
Person ID:1
*/


//3: Constructor Overloading
class Person 
{ 
    Person(String name) 
    { 
        System.out.println("Constructor with one argument (String): " + name); 
    } 
  
    Person(String name, int id) 
    { 
  
        System.out.println("Constructor with two arguments (String + Integer): " + name + " / "+ id); 
  
    } 
  
    Person(int id) 
    { 
        System.out.println("Constructor with one argument (Integer): " + id); 
    } 
} 
  
public class Test 
{ 
    public static void main(String[] args) 
    { 
        Person person1 = new Person("Mert"); 
        Person person2 = new Person("Mert", 1); 
        Person person3 = new Person(123456789); 
    } 
} 
/*OUTPUT
Constructor with one argument (String): Mert
Constructor with two arguments (String + Integer): Mert / 1
Constructor with one argument (Integer): 123456789
*/