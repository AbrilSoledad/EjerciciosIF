package ar.edu.unlam.interfaz;

import java.util.Scanner;

/* Ingresa un carácter alfanumérico y determina e informa
si lo ingresado corresponde a una vocal, con el mensaje “VOCAL”.
y su correspondiente valor numérico en ASCII. */

public class Vocal9 {

	public static void main(String []args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingresa un caracter alfanumerico:");
		char caracter = teclado.next().charAt(0);
		int codigo;
		codigo = caracter;
		
		if (caracter=='a'||caracter=='A'||caracter=='e'||caracter=='E'||caracter=='i'||caracter=='I'||caracter=='o'||caracter=='O'||caracter=='u'||caracter=='U') {
			System.out.println(caracter + " : VOCAL");
			System.out.println("Su valor numerico en el codigo ASCII es: " + codigo );
		    
		} else {
			System.out.println("No es una vocal");
		}

		teclado.close();
	}
}
