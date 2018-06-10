package br.com.prova_OCP_808.programaTeste_01;

public class StringTestQ_08 {
	
	public static void main(String[] args) {
		
		String ta = "A ";
		ta = ta.concat("B ");
		
		String tb = "C ";
		ta = ta.concat(tb);
		
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);
		
		
		
		
	}

}
