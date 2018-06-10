package br.com.prova_OCP_808.programa.abstractclasses;

public abstract class AbstractDog extends AbstractAnimal {
	
	{
		tipo = "Dog";
	}
	public String raca;
	public int idade;


	
	public String getRaca() {
		return raca;
	}
	
	public abstract String getName();
	
	public abstract String getTipo();
	
	

}
