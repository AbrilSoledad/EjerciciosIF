package ar.edu.unlam.interfaz;

import java.util.Scanner;

/*Se ingresan 3 números enteros distintos. Informarlos en orden creciente.*/

public class OrdenCreciente5 {

	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero entero: ");
		int NumUno = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero entero: ");
		int NumDos = teclado.nextInt();
		
		System.out.println("Ingrese el tercer numero entero: ");
		int NumTres = teclado.nextInt();
		
		System.out.println("A continuacion se ordenaran los numeros ingresados en orden creciente.");
		System.out.println("");
		
		//caso 1: 1,2,3//
		if(NumUno < NumDos && NumDos < NumTres) {
			System.out.println(NumUno + ", " + NumDos + ", " + NumTres);
		//caso 2: 2,1,3//	
		} else if(NumDos < NumUno && NumUno < NumTres) {
			System.out.println(NumDos + ", " + NumUno + ", " + NumTres);
		//caso 3: 3,1,2//
		} else if(NumTres < NumUno && NumUno < NumDos) {
			System.out.println(NumTres + ", " + NumUno + ", " + NumDos);
		//caso 4: 2,3,1	
		} else if(NumDos < NumTres && NumTres < NumUno) {
			System.out.println(NumDos + ", " + NumTres + "," + NumUno);
		//caso 5: 3,2,1
		} else if (NumTres < NumDos && NumDos < NumUno) {
			System.out.println(NumTres + ", " + NumDos + ", " + NumUno);
		//caso 6: 1,3,2	
		} else {
			System.out.println(NumUno + ", " + NumTres + ", " + NumDos);
		}
		
		teclado.close();
	}
}
