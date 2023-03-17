package it.epicode.be;

import java.util.Scanner;

public class Esercizio3 {
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		String inputUtente1 = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		String inputUtente2 = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		String inputUtente3 = sc3.nextLine();
		
	//	System.out.println("inserire dati: " + inputUtente1 + " " + inputUtente2 + " " + inputUtente3);
		
		
//		StringBuilder reversedInput1 = new StringBuilder(inputUtente1);
//		reversedInput1.reverse();
//		String newInput1 = reversedInput1.toString();
//		
//		StringBuilder reversedInput2 = new StringBuilder(inputUtente2);
//		reversedInput2.reverse();
//		String newInput2 = reversedInput2.toString();
//		
//		StringBuilder reversedInput3 = new StringBuilder(inputUtente3);
//		reversedInput3.reverse();
//		String newInput3 = reversedInput3.toString();
//		
//		System.out.println("ciao, scrivi qualcosa: " + newInput1 + " " + newInput2 + " " + newInput3);
		
		 String[] array = {inputUtente1, inputUtente2, inputUtente3};
		 boolean ordine = true;
		 
		 stampaStringhe(array, !ordine);
		 
	}
	
	public static void stampaStringhe(String[] array, boolean ordine) {
		if(ordine) {
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		} else {
			for(int i = array.length -1; i >= 0 ; i--) {
				System.out.print(array[i] + " ");
			}
		}
	}
	
}
