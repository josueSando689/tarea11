package tarea11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palabras {
private Scanner scanner;
private List <String> escribirPalabras;

public Palabras() {
	scanner = new Scanner(System.in);
	escribirPalabras = new ArrayList<>();
  }

public void metodoPalabras() {
	
	for (int i=0;i<6;i++ ) {
	 System.out.println("Escribe cualquier palabra");
     String texto = scanner.nextLine();
     
     if (escribirPalabras.contains(texto)) {
         System.out.println("La palabra ya está repetida");
         escribirPalabras.remove(texto);      
     } else {
         escribirPalabras.add(texto);
     }
	}
  }
}
