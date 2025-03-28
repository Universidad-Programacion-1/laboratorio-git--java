package com.laboratorio;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenidos al laboratorio de Git con Java");
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
}
