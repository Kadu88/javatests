package br.com.prova_OCP_808.programa.lambda2;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TraditionalSearch {
	
	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>(); //list of Animals
		
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		
//		print(animals, new CheckIfHopper());	// pass class that does check
		
		print(animals, a -> a.canHop());
		print(animals, a -> a.canSwim());
		print(animals, a -> !a.canSwim());
		print(animals, a -> 1 < 2);
		
	}
	
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		
		for(Animal animal : animals) {
			if(checker.test(animal)) {
				System.out.print(animal + " ");
			}
		}
		
		System.out.println();
	}

}
