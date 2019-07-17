package com.mert.javatutorial;

import java.util.*;
import java.lang.*;
//System.exit(0): genellikle başarılı bir sonlandırılma yapılırsa kullanılır
//System.exit(1) veya System.exit(-1) : genellikle başarısız bir sonlandırılma yapılırsa kullanılır

public class Test
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 5)
            {
                System.out.println("exit...");
                // Java sanal makinesini sonlandır.
                System.exit(0);
            }
            else
                System.out.println("arr["+i+"] = " + arr[i]);
        }
        System.out.println("Program is Terminated");
    } 
} 