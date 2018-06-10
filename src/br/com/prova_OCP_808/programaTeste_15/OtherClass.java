package br.com.prova_OCP_808.programaTeste_15;

public class OtherClass {
	
	public static void main(String [] args) {
		
		CheckingAccount acct = new CheckingAccount((int) (Math.random()*1000));
		
		
//		this.amount = 0;
		acct.amount = 999999;
		System.out.println("A: " + acct.getAmount());
		acct.amount = 999999;
	
		//amount = 0;
		System.out.println("B: " + acct.getAmount());
		acct.amount = 999999;
		
		//acct(0);
		System.out.println("C: " + acct.getAmount());
		acct.amount = 999999;
		
		acct.amount = 0;
		System.out.println("D: " + acct.getAmount());
		acct.amount = 999999;

//		acct.getAmount() = 0;
		System.out.println("E: " + acct.getAmount());
		acct.amount = 999999;
	
		acct.changeAmount(0);
		System.out.println("F: " + acct.getAmount());
		acct.amount = 999999;

		acct.changeAmount(-acct.amount);
		System.out.println("G: " + acct.getAmount());
		acct.amount = 999999;

		acct.changeAmount(-acct.getAmount());
		System.out.println("H: " + acct.getAmount());
		

		
		Double d = new Double(1_000_000.00);

		double h = new Double(1_000_000.00);

		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
