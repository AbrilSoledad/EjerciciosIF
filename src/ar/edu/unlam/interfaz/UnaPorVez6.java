package ar.edu.unlam.interfaz;

import java.util.Scanner;

/* Ingresar 4 números enteros, de a uno por vez y determine
el menor valor y su número de orden. Informe los valores
ingresados e identifique al menor con mensaje aclaratorio.(no entiendo)*/

public class UnaPorVez6 {

	public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int menor, orden = 0;
		
		System.out.println("Ingrese 4 numeros enteros de a uno por vez");
		System.out.println("Ingrse el primer numero: ");
		int numUno = teclado.nextInt();
		menor = numUno;
		orden = 1; 
		System.out.println("Ingrese el segundo numero: ");
		int numDos = teclado.nextInt();
		menor = numDos;
		orden = 2;
		System.out.println("Ingrese el tercer numero: ");
		int numTres = teclado.nextInt();
		menor = numTres;
		orden = 3;
		System.out.println("Ingrese el cuarto numero: ");
		int numCuatro = teclado.nextInt();
		menor = numCuatro;
		orden = 4;
		
		
		if(numUno < menor) {
		    menor = numUno;
		    orden = 1;		
	    }else if (numDos < menor) {
			menor = numDos;
			orden = 2;
		} else if (numTres < menor) {
			menor = numTres;
			orden = 3;
		} else if (numCuatro < menor) {
			menor = numCuatro;
		    orden = 4;
		} 
		
		System.out.println("El numero " + menor + " es el menor");
		System.out.println("Su numero de orden es: " + orden);
		
		
		
		
		teclado.close();
	}
}
