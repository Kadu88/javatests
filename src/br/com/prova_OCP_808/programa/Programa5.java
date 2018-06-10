package br.com.prova_OCP_808.programa;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

import java.util.ArrayList;

public class Programa5 {

	public static void main(String []args ) {
	
		List<String> lista = asList("Teste1", "Teste2");
		
		System.out.println(lista);
		
		
		List<String> lista2 = Arrays.asList("Teste3", "Teste4");
		
		System.out.println(lista2);
		
		
		
		
	}	
	
/*	private static List<String> asList(String...args){
		
		List<String> listaNova = new ArrayList<>();
		
		for(int i = 0; i < args.length; i++) {
			listaNova.add(args[i]);
		}
		System.out.println("Entrou no meu método!");
		return listaNova;
		
	}*/
}