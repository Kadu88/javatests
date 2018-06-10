package br.com.prova_OCP_808.programa.lambda6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.prova_OCP_808.programa.lambda6.Animal;

public class LambdaSearch {

	public static void main(String[] args) {
	
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("dog", true, true));
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		animals.add(new Animal("cat", true, false));
		animals.add(new Animal("tiger", true, true));
		
		searchSonOfABitchThat(animals, a -> a.isHopper() );
		searchSonOfABitchThat(animals, (Animal a) -> {return a.isSwimmer();});
		
	}

	public static void searchSonOfABitchThat(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal animal : animals) {
			if(checker.test(animal)) {
				System.out.println(animal);
			}
		}
		System.out.println();
	}
	
}
