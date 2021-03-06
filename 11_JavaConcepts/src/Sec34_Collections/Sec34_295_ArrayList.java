package Sec34_Collections;
import java.util.ArrayList;

public class Sec34_295_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("12333");
		a.add("Java");
		
		//Print ArrayList
		System.out.println(a);
		
		a.add(0, "student");
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		//Get element at particular index
		System.out.println(a.get(0));
		
		//Vailidate if string present or not in arraylist
		System.out.println(a.contains("student"));
		
		// get index of element
		System.out.println(a.indexOf("Java"));
		
		//Get size of arrayList
		System.out.println(a.size());
		
		//Class which implements list interface can accept duplicate values
		a.add("student");
		System.out.println(a);
		
	}

}
