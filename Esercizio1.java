package it.epicode.be;

import java.util.Arrays;

public class Esercizio1 {
	public static void main (String[] args) {
		
		String array[] = {"A", "B", "C", "D", "E"};
		
		System.out.println("Moltiplicazione: " + moltiplica (6, 4));
		System.out.println("Concatena stringa e intero: " + concatena ("Stringa ", 4));
		//System.out.println("InserisciInArray: " + inserisciInArray (array, 4));
	 
			System.out.println("InserisciInArray: " + Arrays.toString(inserisciInArray(array, "ciao")));
		
		
	}
	
	public static int moltiplica (int x, int y) {
		return x * y;
	}
	
	public static String concatena (String a, int b) {
		return a + b;
	}
	
	public static String[] inserisciInArray (String a[], String b) {
		String newArr[] = new String [a.length + 1];
		for(int i = 0; i < newArr.length; i++) {
			if(i == newArr.length - 3) {
				newArr[i] = b;
			} else {if (i > newArr.length - 3) {
				newArr[i] = a[i -1];
			} else {newArr[i] = a[i];}
				
			}
		} return newArr;	
	}
}
