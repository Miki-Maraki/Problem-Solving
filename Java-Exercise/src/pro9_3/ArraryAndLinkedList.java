package pro9_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArraryAndLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();
		
		ll = list;
		
		ll.add("Moke");
		list.add("Beki");
		
		
		Iterator<String> myIt = list.iterator();
		while(myIt.hasNext()) {
			System.out.println(myIt.next());
			myIt.remove();
			
		}
		
		list.forEach(s-> System.out.println(s));
		
		
		for(String s:list) {
			System.out.println(s);
		}
		

	}

}
