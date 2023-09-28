/*
TP2 - Esteban Bergero - Parte 2

Hacer un programa que solicite al usuario un número entre 0 y 9.999 e imprimir por pantalla 
cuántas cifras tiene este número.
Si el valor ingresado por el usuario es menor a cero o mayor a 9.999 deberá informar 
que no pertenece al rango solicitado.

*/

import java.util.Scanner;

public class Parte2
{
	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número, entre 0 y 9.999: ");
        Float numero;
        numero = teclado.nextFloat();
        
        if (numero < 0 | numero > 9.999){
            System.out.println("El número ingresado no pertenece al rango solicitado");
        }

        if (numero > 0 & numero <= 9.999){

            String decimal = Float.toString(numero);
            int total = decimal.length();

            if (numero % 1 == 0){

                total = total -2;
                System.out.println("El número ingresado es: " + numero);
                System.out.println("total de cifras: " + total);
            }
            if (numero % 1 != 0){
                total = total -1;
                System.out.println("El número ingresado es: " + numero);
                System.out.println("total de cifras: " + total);
            }
        }
    }
}
//             OJO
//         	 OJOTA
//         HOJALDRE
//    QUE SE PUEDE ROMPER DEPENDIENDO SI USAMOS COMA O PUNTO PARA EL DECIMAL