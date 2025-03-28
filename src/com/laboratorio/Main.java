package com.laboratorio;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenidos al laboratorio de Git con Java");

		
		Multi();

		suma();
	}
	public static int suma() {
		int numeroUno = 10;
		int numeroSuma = 0;
		for(int i=0; i<numeroUno; i++) {
			numeroSuma = numeroUno+i;
			System.out.println(numeroSuma);
		}
		return numeroSuma;

	}
	
	
	
	
	public static void Multi() {
		System.out.println("ingrese los numeros que quiere multiplicar: ");
		int tamaño = scanner.nextInt();
		int[] listaMultiplicar = new int[tamaño];
		for (int i = 0; i < tamaño; i++) {
			System.out.println("ingrese el numero " +  (i + 1) + ":");
			listaMultiplicar[i] = scanner.nextInt();
		}
		
		
		int cont = 1;
		
		for (int lista : listaMultiplicar) {
			
			int resultado = cont * lista;
			cont = resultado;
			
		}
		
		System.out.println ("El resultado es: " + cont);	
		
		
	}
	
}
