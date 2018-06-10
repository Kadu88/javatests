package br.com.prova_OCP_808.programa.lambda6;

public class Animal {
	
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String species, boolean isHopper, boolean isSwimmer) {
		this.species = species;
		this.canHop = isHopper;
		this.canSwim = isSwimmer;
	}
	
	public String getSpecies() {
		return species;
	}
		
	public boolean isHopper() {
		return this.canHop;
	}
	
	public boolean isSwimmer() {
		return this.canSwim;
	}

	public String toString() {
		return species;
	}
}
