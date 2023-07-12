package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Medico17 {

public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el numero de historia del paciente: ");
		int historia = teclado.nextInt();
		System.out.println("Ingrese el codigo de la prestacion: ");
		char codigo = teclado.next().charAt(0);
		
		int importe = 0;
		
		if(codigo =='A') {
			importe = 20;
		} else if(codigo == 'D') {
			importe = 40;
		} else if(codigo == 'F') {
			importe = 60;
		} else if(codigo == 'M') {
			importe = 150;
		} else if(codigo == 'T') {
			importe = 150;
		}
		
		System.out.println("El numero de la historia es: " + historia +", el codigo es: " + codigo + ", el importe es: " + importe);
		
		teclado.close();
  }	
}
