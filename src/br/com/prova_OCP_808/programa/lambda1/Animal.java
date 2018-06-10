package br.com.prova_OCP_808.programa.lambda1;

public class Animal {

	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		this.species = speciesName;
		this.canHop = hopper;
		this.canSwim = swimmer;
	}

	public boolean canHop() { return this.canHop; }
	public boolean canSwim() { return this.canSwim; }
	public String toString() { return this.species; }
}
