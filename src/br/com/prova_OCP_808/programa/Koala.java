package br.com.prova_OCP_808.programa;

import java.lang.StringBuilder;

public class Koala {
	
	private StringBuilder nome = new StringBuilder("Nome do Koala é: ");
	
	public static int count = 0;
	
	public static void main(String...args) {
		
		System.out.println(count);		
	}
	
	public Koala(int number) {
		Koala.count += number;
		Koala.main();

	}
	
	public void printCount() {	
		System.out.println("Print: " + count);		
	}	
	
	public StringBuilder getNome() {
		
		return new StringBuilder(this.nome);
	}
	
}
