package it.epicode.be;

import java.util.Scanner;

public class Esercizio4 {
	public static void main(String[] args) {
		
		Scanner latoRettangoloA = new Scanner(System.in);
		double inputLatoRettangoloA = latoRettangoloA.nextDouble();
		Scanner latoRettangoloB = new Scanner(System.in);
		double inputLatoRettangoloB = latoRettangoloB.nextDouble();
		
		Scanner pariDispari = new Scanner (System.in);
		int inputPariDispari = pariDispari.nextInt();
		
		Scanner latoTriangoloA = new Scanner(System.in);
		double inputLatoTriangoloA = latoTriangoloA.nextDouble();
		
		Scanner latoTriangoloB = new Scanner(System.in);
		double inputLatoTriangoloB = latoTriangoloB.nextDouble();
		
		Scanner latoTriangoloC = new Scanner(System.in);
		double inputLatoTriangoloC = latoTriangoloC.nextDouble();
		
		
		System.out.println("Lati rettangolo: " + calcolaPerimetro(inputLatoRettangoloA, inputLatoRettangoloB));
		System.out.println("Numero pari o dispari: " + pariDispari(inputPariDispari));
		System.out.println("Area triangolo: " + areaTriangolo(inputLatoTriangoloA, inputLatoTriangoloB, inputLatoTriangoloC));
	}
	
	public static double calcolaPerimetro(double latoA, double latoB) {
		return (latoA + latoB) * 2;
	}
	
	public static int pariDispari(int a) {
		if (a % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static double areaTriangolo(double latoA, double latoB, double latoC) {
		double semiPerimetro = (latoA + latoB + latoC) / 2;
		double prodottoDiSottrazioni = semiPerimetro * (semiPerimetro - latoA) * (semiPerimetro - latoB) * (semiPerimetro - latoC);
		double area = Math.sqrt(prodottoDiSottrazioni);
		return area;
	}
}
