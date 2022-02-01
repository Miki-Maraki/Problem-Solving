package javaInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// How to Remove an Element from Array in Java
public class RemoveArray {

	public static void main(String[] args) {
		// give array
		int[] arr = { 5, 12, 34, 54, 9, 29, 12, 36, 9, 40 };
        
		// Solution
		System.out.println("array length " + arr.length); // 10
		List<Integer> list = new ArrayList<Integer>();
		for (int l : arr) { // change array to List
			list.add(l);
		}
		System.out.println("list is " + list);//[5, 12, 34, 54, 9, 29, 12, 36, 9, 40]
		System.out.println("size of list before remove " + list.size()); // 10

		list.remove(3); // remove at index 3
		System.out.println(list); // [5, 12, 34, 9, 29, 12, 36, 9, 40]
		System.out.println("size of list after remove " + list.size()); // 9

		// reverse array
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]); // 40, 9, 36, 12, 29, 9, 54, 34, 12, 5
		}
		// remove duplicate from array
		Set<Integer> set = new HashSet<Integer>();
		for (int s : arr) {
			set.add(s);
		}
		System.out.println("set is " + set); // [34, 36, 5, 54, 40, 9, 12, 29]
		System.out.println("set of array length  " + set.size()); // 8

		// sorting of list by default it'll be ascending 
		Collections.sort(list);
		System.out.println("sorted list " + list);//[5, 9, 9, 12, 12, 29, 34, 36, 40]
		System.out.println("size of sorted list " + list.size()); // 9

		// remove duplicate from list
		Set<Integer> sett = new HashSet<Integer>();
		for (int s : list) {
			sett.add(s);
		}
		System.out.println("set of list is " + sett); //[34, 36, 5, 40, 9, 12, 29]
		System.out.println("size of set list is " + sett.size()); // 7
	}
}
