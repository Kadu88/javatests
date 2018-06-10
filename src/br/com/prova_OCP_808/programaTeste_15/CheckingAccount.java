package br.com.prova_OCP_808.programaTeste_15;

public class CheckingAccount {

	public int amount;
	
	public CheckingAccount (int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void changeAmount(int x) {
		amount += x;
	}
}
