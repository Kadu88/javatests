package br.com.prova_OCP_808.programa.lambda1;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class TraditionalSearch {
	
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit",true ,false ));
		animals.add(new Animal("turtle", false, true));
		
//		print(animals, new CheckIfHopper()); // pass class that does check
//		print(animals, new CheckIfSwimmer()); // pass class that does check

		print(animals, a -> a.canHop());
		print(animals, a -> a.canSwim());
		
		printBeginWith(animals, a -> a.toString().startsWith("fi"));
		printBeginWith(animals, a -> a.toString().endsWith("roo"));
		printBeginWith(animals, a -> a.toString().contains("i"));
		printBeginWith(animals, a -> !a.toString().contains("i"));
	}
	
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		
		for(Animal animal : animals) {
			if(checker.test(animal)) {		// the general check
				System.out.println(animal + " ");
			}
		}
		System.out.println();
	}
	
	private static void printBeginWith(List<Animal> animals, CheckBegin checker) {
		for(Animal animal : animals) {
			if(checker.checkBegin(animal)) {		// the general check
				System.out.println(animal + " ");
			}
		}
		System.out.println();		
	}
}
