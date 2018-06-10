package br.com.prova_OCP_808.programa.extendingClasses;

public class Lion extends Animal {
	
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}
	
	public static void main(String[] args) {
		
		int a = InterfaceTeste.NUM_DIA_NASCI;
		int b = InterfaceTeste.NUM_IDADE;
		
		System.out.println("Nasci " + a);
		System.out.println("Idade " + b);

		
		new Lion().roar();
	}

}
