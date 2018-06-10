package br.com.prova_OCP_808.programa.lambda3;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TraditionalSearch {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo",true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		print(animals, an -> an.canHop());
		print(animals, ani -> ani.canSwim());
		print(animals, a -> {return (!a.canHop() && a.canSwim());});

		print(animals, a -> {int x = 0; boolean ret = false; ret = x < 1 ? !a.canHop() && a.canSwim() : a.canHop() && !a.canSwim(); return ret;});

		print(animals, (Animal a)-> {int x = 0; boolean ret = false; ret = x < 1 ? !a.canHop() && a.canSwim() : a.canHop() && !a.canSwim(); return ret;});

		
		int numeroInteger = 18;
		Long numeroLong = (long) numeroInteger;
		
		getInteger(numeroInteger);
		getLong(numeroLong);
		
		getInteger(numeroInteger);
		getLong((Object)(Long)(long)numeroInteger);
		
		
	}
	
	
	public static void getInteger(Integer integer) {
		
	}
	public static void getLong(Object longo) {
		
	}
	
	
	private static void print(List<Animal> listaAnimais, MyMonsterInterfacePredicate<Animal> checker) {
		
		for(Animal animalzinho : listaAnimais) {
			
			if(checker.test(animalzinho)) {
				System.out.print(animalzinho + " ");
			}
			
		}
		System.out.println();
	}
		
}
