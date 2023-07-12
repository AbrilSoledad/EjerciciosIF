package ar.edu.unlam.interfaz;

import java.util.Scanner;

/* Solicite e ingrese 3 valores reales positivos, mayores
que cero y determine e informe si forman o no triángulo.
Para ello utilizar el teorema de la desigualdad del triángulo
que establece que la suma de las longitudes de cualesquiera de
dos lados de un triángulo es mayor que la longitud del tercer lado.*/

public class Triangulo7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese tres numeros reales positivos mayores a cero uno por vez.");
		System.out.println("Ingrese el primer numero: ");
		int num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		int num3 = teclado.nextInt();
		
		if(num1 > 0 && num2 > 0 &&  num3 > 0 && num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2) {
			System.out.println("Si se puede formar un triangulo");
		} else {
			System.out.println("No se puede formar un triangulo");
		}
	
		teclado.close();
	}
}
