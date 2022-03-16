package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
	public static void main(String[] args) {  
        //creating ArrayList  
        List<String> fruitList = new ArrayList<>();  
        //adding String Objects to fruitsList ArrayList  
        fruitList.add("Mango");  
        fruitList.add("Banana");  
        fruitList.add("Apple");  
        fruitList.add("Strawberry");  
        fruitList.add("Pineapple");  
        System.out.println("List is " + fruitList);          // print List
        
        System.out.println("Converting ArrayList to Array");  
        String[] item = fruitList.toArray(new String[fruitList.size()]);
        for(String s : item){  
            System.out.println(s);                            // print Array
        }  
        
        System.out.println("Converting Array to ArrayList");  // option 1
        List<String> list2 = new ArrayList<>();  
        list2 =  Arrays.asList(item);  
        System.out.println(list2);   // print List2
        
        List <String> list = new ArrayList <String> ();         // option 2
        for(String l:item) {
        	list.add(l);
        }
        System.out.println("final list " + list); // print list 
    }  

}
