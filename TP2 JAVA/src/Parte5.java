/*
TP2 - Esteban Bergero - Parte 5

Hacer un programa que solicite al usuario un número N, introducir N sueldos e imprimir por pantalla:
-El sueldo más alto
-El sueldo más bajo
-El promedio de TODOS los sueldos ingresados

*/

import java.util.Arrays;
import java.util.Scanner;

public class Parte5 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
      
	    System.out.println("Ingrese cantidad de sueldos a cargar: ");
	    int numero = teclado.nextInt();
	    int total = 0;
	    int mayor = 0;
	    int menor = 0;
	    int promedio = 0;
	    
	    int[] sueldos = new int[numero];
	    
	    for(int i = 0; i < numero; i++) {
	    	System.out.println("Ingrese el "+(i+1)+"° Sueldo: ");
	    	sueldos[i] = teclado.nextInt();
	    	
	    	total = total + sueldos[i];
	    	if(sueldos[i] > mayor) {
	    		mayor = sueldos[i];
	    	}
	    	if (menor == 0) {
	    		menor = sueldos[0];
	    	}
	    	if(menor > sueldos[i]) {
	    		menor = sueldos[i];
	    	}
	    }
	    System.out.println("Usted ingresó "+numero+" sueldos, estos son:");
	    System.out.println(Arrays.toString(sueldos));
	    System.out.println("El sueldo más alto es: "+mayor);
	    System.out.println("El sueldo más bajo es: "+menor);
	    System.out.println("El promedio de todos los sueldos es: "+total/numero);
    }
}
