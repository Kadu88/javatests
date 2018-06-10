package br.com.prova_OCP_808.programa.abstractclasses;

public class Shih_tzu extends AbstractDog implements AnimalMamiferoInterface, AnimalMamiferoNoturnoInterface { 
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getTipo() {
		return "Shih-tzu";
	}

	@Override
	public String getNumeroTetas() {
		
		System.out.println("Pode ter até: " + getNumeroMaximoFilhos() + " filhos");
		
		return "Tem até oito tetas quando é fêmea";
	}
}
