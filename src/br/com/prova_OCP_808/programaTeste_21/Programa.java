package br.com.prova_OCP_808.programaTeste_21;

public class Programa {

	public static void main(String[] args) {

//		int[] array = new int[2];
	
		int[][] array = new int[6][30];
		Object[] obj = array;
		
		array[3][12] = 10;
		array[2][23] = 20;
		
		obj[2] = "String";
		
		
		
		System.out.println(array[0] + ":" + array[1]);

		
	}

}
