package br.com.prova_OCP_808.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {

		List<String> listaNomes = 
				Arrays.asList("Lidiane", "Luiza", "Carlos", "Adaltiza", "Vanessa", "Ana Luiza", "André", "Ryan", "Duda", "Gabi");
		
		Collections.sort(listaNomes);
		
		System.out.println(listaNomes);
		
		String [] nomesArray = new String[] {"Vanda", "Visão", "Homem de Ferro", "Doutor Estranho"};
		
		List<String> listaNomes2 = Arrays.asList(nomesArray);
		Collections.sort(listaNomes2);
		
		System.out.println(listaNomes2);
		
		String[] nomesArray2 = new String[4];
		
		nomesArray2 = (String[]) listaNomes2.toArray();

		
		Arrays.sort(nomesArray2);
		
		List<String> listaFinal = Arrays.asList(nomesArray2);
		System.out.println(listaFinal);
	}
}