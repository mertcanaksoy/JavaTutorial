package com.mert.javatutorial; 
import java.util.HashMap; 
import java.util.Map; 
  
public class Test 
{ 
    public static void main(String[] args)  
    { 
      
        HashMap<String, Integer> map = new HashMap<>(); 
          
        print(map); 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
          
        System.out.println("Size of map is: " + map.size()); 
      
        print(map); 
        
        if (map.containsKey("vishal"))  
        { 
            Integer val = map.get("vishal"); 
            System.out.println("value for key \"vishal\" is: " + val); 
        } 
          
        map.clear(); 
        print(map); 
    } 
      
    public static void print(Map<String, Integer> map)  
    { 
        if (map.isEmpty())  
        { 
            System.out.println("map is empty"); 
        } 
          
        else
        { 
            System.out.println(map); 
        } 
    } 
}
/*OUTPUT
map is empty
Size of map is: 3
{vaibhav=20, vishal=10, sachin=30}
value for key "vishal" is: 10
map is empty
*/