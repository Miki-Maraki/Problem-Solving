package javaInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse2 {
	
	public static void main(String [] args) {
	String st = "GeeksForGeeks";           // literal string
	    
  //String class does not have reverse() method, SBuffer and SBuilder class has built in reverse() method. 
  //StringBuilder class do not have toCharArray() method, String class does have toCharArray() method.
  //SBuffer and Collections also have reverse() method
	System.out.println("option 1 by using the String toCharArray() method");
    // convert String to character array by using toCharArray    // option 1
    char[] ca = st.toCharArray();
    System.out.println(ca);                   // GeeksForGeeks

    for (int i = ca.length - 1; i >= 0; i--)
        System.out.print(ca[i]);               // skeeGroFskeeG
    
    System.out.println("\noption 2 by using the SBuilder reverse() method");
    
    String s = "Geeks for Geeks";                                // option 2
    StringBuilder sb = new StringBuilder();
    
    // append a string into StringBuilder sb
   sb.append(s);
   System.out.println(sb);                  // Geeks for Geeks
   
    sb.reverse(); // reverse StringBuilder sb 
    System.out.println(sb);                  // skeeG rof skeeG

    System.out.println("option 3 by using ArrayList object");     // option 3
    String str = "Geeks For Geeks";
    char[] cha = str.toCharArray();   // change string to char
    List<Character> lst = new ArrayList<>();

    for (char cr : cha)  
        lst.add(cr);                  // change char to ArrayList

    Collections.reverse(lst);         // Collections also has reverse() method 
    System.out.println(lst);           // [s, k, e, e, G,  , r, o, F,  , s, k, e, e, G]
    ListIterator li = lst.listIterator();
    while (li.hasNext())
       System.out.print(li.next());     // skeeG roF skeeG
    
    System.out.println("\noption 4 by using the SBuffer reverse() method"); // option 4
    String sr = "Geeks";
    StringBuffer sbr = new StringBuffer(sr);// conversion from String object to StringBuffer
    System.out.println(sbr);   // Geeks
    
    sbr.reverse();            // To reverse the string
    System.out.println(sbr);   // skeeG
   }
}
