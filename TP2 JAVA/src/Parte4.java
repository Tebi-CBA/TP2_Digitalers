/*
TP2 - Esteban Bergero - Parte 4

Hacer un programa que solicite al usuario un número de 3 dígitos e imprimir por consola TODOS 
los valores PARES desde el cero hasta el número ingresado.

*/

import java.util.Scanner;

public class Parte4
{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int imprimir = 0;

        while(numero < 100 | numero > 999){
            System.out.println("Ingrese un número entre 100 y 999: ");
            numero = teclado.nextInt();
        }

        while(imprimir <= numero){
        	{
                System.out.println(imprimir);
                imprimir = imprimir + 2;
            }
            
        }

    }
}
