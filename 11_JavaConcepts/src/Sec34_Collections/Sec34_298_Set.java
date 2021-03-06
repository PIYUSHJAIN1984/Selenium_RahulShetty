package Sec34_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Sec34_298_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("name");
		hs.add("nhj");
		hs.add("name"); // rejected as it is duplicate

		// order is not confirmed of storage
		System.out.println(hs);

		System.out.println(hs.size());

		// To iterate through elements of set
		Iterator<String> i = hs.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
