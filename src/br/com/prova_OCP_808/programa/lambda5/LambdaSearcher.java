package br.com.prova_OCP_808.programa.lambda5;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

import br.com.prova_OCP_808.programa.lambda3.Animal;


public class LambdaSearcher {
	
	public static void main(String []args) {
		
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		System.out.println("Can hop:");
		print(animals, (Animal a) -> { return a.canHop(); });
		
		System.out.println("\nCan swim:");
		print(animals, a -> a.canSwim());
		
		System.out.println("\nFIM");
	}
	
	private static void print(List<Animal> listAnimals, Predicate<Animal> checker) {
		
		for(Animal animal : listAnimals) {
			if(checker.test(animal)) {
				System.out.println(animal);
			}
		}
		
	}

}
