package Sec34_Collections;

import java.util.ArrayList;

public class Sec34_303_CodingPractice {

	public static void main(String[] args) {
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		// print unique values from array and times each number repeats from array

		// Prepare empty list
		ArrayList<Integer> al = new ArrayList<Integer>();

		int index = 0;
		for (int i = 0; i < a.length; i++) {
			int k = 0;

			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println("Value " + a[i] + " " + "repeating " + k + " times");
			}
		}
	}
}
