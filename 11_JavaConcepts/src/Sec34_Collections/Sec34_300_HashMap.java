package Sec34_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sec34_300_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Ram");
		hm.put(1, "bye");
		hm.put(2, "bye1");
		hm.put(3, "bye2");

		System.out.println(hm.get(1));

		Set i = hm.entrySet();
		Iterator it = i.iterator();

		while (it.hasNext()) {

			// Create hashMap and pass value into set collection and print key,values pair
			// This is to separate structure in form of key and value and typecaseted
			Map.Entry mp = (Map.Entry) it.next();

			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
