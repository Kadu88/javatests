package br.com.prova_OCP_808.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Programa2 {

	private static List<List> jogos = new ArrayList<List>();
	private static List<Integer> lista = new ArrayList<>();
	private static Random r = new Random();
	
	public static Integer numeroJogosAMontar = 300;
	public static int maxSize = 6;
	public static int count = 1;
	public static int countRepet = 0;
	public static int countLinhasRepet = 0;
	
	public static void main(String[] args) {		
		
		System.out.println("Número\t\tDz01\tDz02\tDz03\tDz04\tDz05\tDz06\t");
		
		for(int i = 0; i < numeroJogosAMontar; i++) {
			adicionarJogoNaLista();
			System.out.println();
			break;
		}
		
		System.out.println("Repetidos: " + countRepet);
		System.out.println("Linhas Repetidas: " + countLinhasRepet);
		
		for(List<Integer> jogo : jogos) {
			
			if(jogos.contains(jogo)) {
				countLinhasRepet++;
				
			}
			
			
		}
		
	}
	
	private static void adicionarJogoNaLista() {
		
		System.out.print("Jogo " + count + ": \t");
		count++;
		lista.clear();
		while (lista.size() < maxSize) {
			lista.add(incluiNumero());
		}
		Collections.sort(lista, Programa2.comparator());

		for(Integer numero : lista) {
			System.out.print(numero + "\t");
		}
		jogos.add(lista);
	}

	private static Integer incluiNumero() {
		Integer numero = r.nextInt(60) + 1;
		
		while (lista.contains(numero)) {
			countRepet++;
			numero = r.nextInt(59);
		}
		
		return numero;		
	}
	
	private static Comparator<Integer> comparator() {		
		// TODO Auto-generated method stub
		return null;
	}
}