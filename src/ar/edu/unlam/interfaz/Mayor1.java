package ar.edu.unlam.interfaz;

import java.util.Scanner;

//Se ingresan 3 números distintos. Determinar el mayor.//

public class Mayor1 {

	public static void main (String []args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese tres numeros distintos y a continuacion se determinara cual es el mayor");
		System.out.println("Ingrese el primer numero: ");
		int numUno = teclado.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int numDos = teclado.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		int numTres = teclado.nextInt();
		
		// si numUno es mayor que numDos y numTres, mostrar el numUno //
	    // si numDos es mayor que numUno y numTres, mostrar el numDos //
		// si numTres es mayor que numUno y numDos, mostrar el munTres //
		
		if (numUno > numDos && numUno > numTres) {
			System.out.println("El mayor es: " + numUno);
		} else if (numDos > numUno && numDos > numTres) {
			System.out.println("El mayor es: " + numDos);
		} else if (numTres > numUno && numTres > numDos) {
			System.out.println("El mayor es: " + numTres);
		}
		
		teclado.close();
	}
}
