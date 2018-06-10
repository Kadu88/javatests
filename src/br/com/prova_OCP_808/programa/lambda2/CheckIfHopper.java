package br.com.prova_OCP_808.programa.lambda2;

public class CheckIfHopper implements CheckTrait {

	public boolean test(Animal a) {
		return a.canHop();
	}
}
