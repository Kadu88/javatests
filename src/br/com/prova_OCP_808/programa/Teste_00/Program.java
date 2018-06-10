package br.com.prova_OCP_808.programa.Teste_00;

import java.time.Duration;
import java.time.LocalTime;

public class Program {

	public static void main(String[] args) {

		LocalTime tempoInicio;
		LocalTime tempoFim;
		LocalTime tempoExecucao;
		Duration tempoExecutando;
		
		// Printar todos os números múltiplos de 3 de 0 até 100
		System.out.println("Printar todos os números múltiplos de 3 de 0 até 100, passando de 1 em 1");
		tempoInicio = LocalTime.now();
		for (int i = 0; i <= 1000; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		tempoFim = LocalTime.now();
		
		tempoExecutando = Duration.between(tempoInicio, tempoFim);
		
		tempoExecucao = LocalTime.ofNanoOfDay(tempoExecutando.toNanos());
		System.out.println();
		System.out.println("Tempo executando percorrendo de um em um em nanos: \n" + tempoExecucao);
		
		
		
		// Printar todos os números múltiplos de 3 de 0 até 100
		System.out.println("Printar todos os números múltiplos de 3 de 0 até 100, passando de 3 em 3");
		tempoInicio = LocalTime.now();
		for (int i = 0; i <= 1000; i+=3) {
				System.out.print(i + " ");
		}
		tempoFim = LocalTime.now();
		
		tempoExecutando = Duration.between(tempoInicio, tempoFim);
		
		tempoExecucao = LocalTime.ofNanoOfDay(tempoExecutando.toNanos());
		System.out.println();
		System.out.println("Tempo executando percorrendo de 3 em 3 em nanos: \n" + tempoExecucao);
		
		
		// Printar fatorial de 1 a 10
		int fatorialZero = 1;
		int fatorialAtual;
		int fatorialAnterior=1;
		
		System.out.println("O fatorial de 0 é " + fatorialAnterior);
		
		for(int iFat = 1; iFat <= 10; iFat++) {
			fatorialAtual = iFat * fatorialAnterior;
			System.out.println("O fatorial de " + iFat + " é " + fatorialAtual);
			fatorialAnterior = fatorialAtual;
		}
		
		
	
	}
}
