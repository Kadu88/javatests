package br.com.prova_OCP_808.programa.lambda4;

import java.util.List;

import br.com.prova_OCP_808.programa.lambda3.Animal;

import java.util.ArrayList;
import java.util.function.Predicate;


public class TraditionaSearch {
	
	public static void main(String[] args) {
		
		System.out.println("Início");
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		print("Lista de animais que pulam: ", animals, a -> a.canHop());
		print("Lista de animais que nadam: ", animals, a -> a.canSwim());
		
		System.out.println("\nFim");
	}
	
	private static void print(String nomeLista, List<Animal> animals, Predicate<Animal> animalChecker) {
		System.out.println("\n" + nomeLista);
		for(Animal animal : animals) {
			if(animalChecker.test(animal)) {
				System.out.println(animal);
			}
		}
	}

}
