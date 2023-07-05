package tarea11;

import java.util.Scanner;
import java.util.Arrays;


public class ListasNumeros {
    int []guardarNumeros = new int[5];
	public Scanner scanner = new Scanner (System.in);
	
	public void laMagia() {
		
		for(int i=0;i<5;i++) {
		System.out.println("Ingresa un numero");
		int numero = scanner.nextInt();
		guardarNumeros[i]=numero;
	  }
		Arrays.sort(guardarNumeros);
		System.out.println("los números ordenados de forma ascendente son:");
	    for (int num : guardarNumeros) {
	    System.out.println(num);
	        }
	}
}
