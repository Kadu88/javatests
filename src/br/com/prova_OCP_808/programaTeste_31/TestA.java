package br.com.prova_OCP_808.programaTeste_31;

public class TestA {

	public static void main(String[] args) {
		Alpha ref1 = new Alpha(50);
		Alpha ref2 = new Alpha(125);
		Alpha ref3 = new Alpha(100);
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
		
		
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		String str2 = str1;
		
		System.out.println(str1 == str2);
		
		
	}
	
}
