package com.mert.javatutorial;

import java.util.Arrays; 

public class Test 
{ 
    public static void main (String[] args)  
    { 
        int arr1[] = {1, 2, 3}; 
        int arr2[] = {1, 2, 3}; 
        if (Arrays.equals(arr1, arr2)) 
            System.out.println("Same (equals metodu ile)"); 
        else
            System.out.println("Not same (equals metodu ile)"); 

        if (arr1 == arr2)
            System.out.println("Same (== operatörü ile)"); 
        else
            System.out.println("Not same (== operatörü ile)"); 
    } 
}
/*OUTPUT
Same (equals metodu ile)
Not same (== operatörü ile)
*/