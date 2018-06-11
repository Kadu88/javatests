package br.com.prova_OCP_808.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		
		System.out.println(numbers); // [99, 5, 81]	
		Collections.sort(numbers);	//Sorting	
		System.out.println(numbers); // [5, 81, 99]
		
		/*String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list = Arrays.asList(array); // returns fixed size list
		System.out.println(list.size()); // 2
		list.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b : array) System.out.print(b + " "); // new test
		list.remove(1); // throws UnsupportedOperation Exception
*/		
	}
}