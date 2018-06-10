package br.com.prova_OCP_808.programa.lambda5;

public class Animal {

	private String nameSpecie;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String nameSpecie, boolean canHop, boolean canSwim) {
		this.nameSpecie = nameSpecie;
		this.canHop = canHop;
		this.canSwim = canSwim;			
	}
	
	public boolean isHopper() {
		return this.canHop;
	}
	
	public boolean isSwimmer() {
		return this.canSwim;
	}
	
	public String getNameSpecie() {
		return this.nameSpecie;
	}
	
	public String toString() {
		return this.nameSpecie;
	}
}
