package com.mert.javatutorial;
public class Test  
{ 
    public static void main (String[] args)  
    {           
      int[] arr;
      arr = new int[5];
      arr[0] = 10;
      arr[1] = 20;
      arr[2] = 30; 
      arr[3] = 40; 
      arr[4] = 50; 
          
      for (int i = 0; i < arr.length; i++) 
         System.out.println("Element at index " + i + ": "+ arr[i]);           
    } 
} 
/*OUTPUT
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
*/

class Student 
{ 
    public int roll_no; 
    public String name; 
    Student(int roll_no, String name) 
    { 
        this.roll_no = roll_no; 
        this.name = name; 
    } 
} 
  
public class Test 
{ 
    public static void main (String[] args) 
    { 
        Student[] arr = new Student[5]; 
        arr[0] = new Student(1,"mert"); 
        arr[1] = new Student(2,"tuğçe"); 
        arr[2] = new Student(3,"selin"); 
        arr[3] = new Student(4,"şule"); 
        arr[4] = new Student(5,"dila"); 
  
        for (int i = 0; i < arr.length; i++) 
            System.out.println("Element at " + i + ": " +arr[i].roll_no +" (Roll No) "+ arr[i].name +" (Name)"); 
    } 
}
/*OUTPUT
Element at 0: 1 (Roll No) mert (Name)
Element at 1: 2 (Roll No) tuğçe (Name)
Element at 2: 3 (Roll No) selin (Name)
Element at 3: 4 (Roll No) şule (Name)
Element at 4: 5 (Roll No) dila (Name)
*/

//Çok boyutlu dizi örneği

public class multiDimensional 
{ 
    public static void main(String args[]) 
    { 
        int arr[][] = { {1,3,5},{2,4,6},{7,8,9} }; 
        for (int i=0; i< 3 ; i++) 
        { 
            for (int j=0; j < 3 ; j++) {
                System.out.print(arr[i][j] + " ");
            }       
            System.out.println(); 
        } 
    } 
}
/*OUTPUT
1 3 5 
2 4 6 
7 8 9
*/

//Array'in içindeki elemanları topla
public class Test 
{     
    public static void main(String args[])  
    { 
        int arr[] = {1, 2, 3, 4, 5}; 
        sum(arr); 
    } 
  
    public static void sum(int[] arr)  
    { 
        int sum = 0; 
          
        for (int i = 0; i < arr.length; i++) 
            sum+=arr[i]; 
        System.out.println("sum of array values : " + sum); 
    } 
} 
/*OUTPUT
sum of array values : 15
*/