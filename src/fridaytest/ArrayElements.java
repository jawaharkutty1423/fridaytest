package fridaytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayElements {
	
	public void list() {
	
	List <String> arrayList = new ArrayList<String>();
	
	arrayList.add("Jawahar");
	arrayList.add("Hashni");
	arrayList.add("Shivani");
	arrayList.add("Shivaji");
	
	System.out.println("Normal order " + arrayList);
	 Collections.reverse(arrayList); 
	 System.out.println("Reverse Order " + arrayList);
	
	}
	 public static void main(String[] args) {          
		 ArrayElements a = new ArrayElements();
		 a.list();
	             
	          }  
}

