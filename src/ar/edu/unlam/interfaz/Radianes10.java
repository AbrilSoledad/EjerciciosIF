package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Radianes10 {

public static void main(String []args) {
	
	Scanner teclado = new Scanner (System.in);
	
	System.out.println("Ingrese el codigo: 1 si se ingresan grados y 2 si se ingresan radianes.");
	int codigo = teclado.nextInt();
	System.out.println("Ingrese el valor que desea convertir: ");
    double valor = teclado.nextDouble();
	
	double radian = 180.0 / Math.PI;
	double grado = Math.PI /180.0;
	
	if(codigo == 1) {
		double totalradian = valor * radian;
		System.out.println("El valor de " + valor + " grados en radianes es: " + totalradian);
	} else if(codigo == 2) {
		double totalgrado = valor * grado;
		System.out.println("El valor de " + valor + " radianes en grados es: " + totalgrado);
	}
	
	
	
	teclado.close();
  }
}
