package br.com.prova_OCP_808.programa.abstractclasses;

public abstract interface AnimalMamiferoInterface {
	
	public abstract String getNumeroTetas();

	public default int getNumeroMaximoFilhos() {
		return 5000;
	}
	

	
}
