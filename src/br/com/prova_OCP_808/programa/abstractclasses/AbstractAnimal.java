package br.com.prova_OCP_808.programa.abstractclasses;

public abstract class AbstractAnimal {

	public String tipo;
	public String name;
	
	public abstract String getName();
	
	public void setName(String name) {
		this.name = name;
	}

	public String getTipo() {
		return this.tipo;
	}
	
}
