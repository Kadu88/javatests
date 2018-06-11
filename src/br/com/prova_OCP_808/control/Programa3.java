package br.com.prova_OCP_808.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programa3 {

	public static void main(String[] args) {

		String[] bugs = {"cricket", "beetle", "ladybug"};
		String[] alias = bugs;
		
		System.out.println(bugs == alias);
		System.out.println(bugs.equals(alias));
		
		bugs[0] = "Festa";
		
		System.out.println(bugs[0]);
		System.out.println(alias[0]);
		
		System.out.println(bugs == alias);
		System.out.println(bugs.equals(alias));
	}
}