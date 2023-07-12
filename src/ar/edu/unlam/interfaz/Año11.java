package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Año11 {
	
  public static void main(String []args) {
	  
	  Scanner teclado = new Scanner (System.in);
	  
	  System.out.println("Escriba el anio: ");
	  int anio = teclado.nextInt();
	  
	  System.out.println("Escriba el mes con el numero correspondiente: ");
	  int mes = teclado.nextInt();
	  
	  if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
		  System.out.println("El mes tiene 31 dias");
	  } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
		  System.out.println("El mes tiene 30 dias");
	  } else if(anio % 4 == 0 && anio % 100 != 0 && mes == 2) {
		  System.out.println("El mes tiene 29 dias");
	  } else {
		  System.out.println("El mes tiene 28 dias");
	  }
	  
	  
	  teclado.close();
  }
}
