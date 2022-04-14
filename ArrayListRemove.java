package Tathastu;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemove {
	public static void main(String[] args) {
		ArrayList<String> arraylist_1 = new ArrayList<String>(Arrays.asList("apple", "banana", "mango", "orange", "papaya", "plum"));
	                 
	        int fromIndex = 1;
	        int toIndex = 3;
	        arraylist_1.subList(fromIndex, toIndex+1).clear();
	         
	        arraylist_1.forEach(element -> {
	            System.out.println(element);
	        });	         
	}
}
