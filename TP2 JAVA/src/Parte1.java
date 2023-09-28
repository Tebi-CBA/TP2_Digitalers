/*
TP2 - Esteban Bergero - Parte 1

Hacer un programa que solicite una nota al usuario y dependiendo de la misma
imprimir por pantalla, la nota y el detalle siguiente:
-Insuficiente: 0 - 3
-Suficiente: 4
-Bien: 5 y 6
-Notable: 7 y 8
-Sobresaliente: 9 y 10

*/
import java.util.Scanner;

public class Parte1 {
	
	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nota = 0;

        do{
            System.out.println("Ingrese su nota, entre 0 y 10: ");
            nota = teclado.nextInt();
        } while (nota < 0 || nota > 10);

        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Tu nota es: " + nota + ", Insuficiente.. ");
                break;
            case 4:
                System.out.println("Tu nota es: " + nota + ", Suficiente ");
                break;
            case 5:
            case 6:
                System.out.println("Tu nota es: " + nota + ", Bien ");
                break;
            case 7:
            case 8:
                System.out.println("Tu nota es: " + nota + ", Notable ");
                break;
            case 9:
            case 10:
                System.out.println("Tu nota es: " + nota + ", Sobresaliente ");
                break;
        }
    }
}
