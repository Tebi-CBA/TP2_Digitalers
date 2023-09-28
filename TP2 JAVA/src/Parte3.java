/*
TP2 - Esteban Bergero - Parte 3

Hacer un programa que solicite al usuario 5 números y los ordene de mayor a menor 
y lo mismo pero que ordene de menor a mayor.
(Impreso por consola)

*/

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Parte3
{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int[] vector = new int[5];
        int numero = 0;
        int menor;
        int mayor;
        
        for (int i = 0;i<5 ;i++ ){
            
            switch(i){
                case 0:
                    System.out.println("Ingrese el primer número: ");
                    numero = teclado.nextInt();
                    break;
                case 1:
                    System.out.println("Ingrese el segundo número: ");
                    numero = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("Ingrese el tercer número: ");
                    numero = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("Ingrese el cuarto número: ");
                    numero = teclado.nextInt();
                    break;
                case 4:
                    System.out.println("Ingrese el quinto número: ");
                    numero = teclado.nextInt();
                    break;
            }
            vector[i] = numero;
        }
        System.out.println("Usted ingresó los números: "+Arrays.toString(vector));
        
        for(int i = 0; i < 4; i++){
            for (int j = i+1; j < 5 ; j++) {
                if (vector[j]<vector[i]){
                    int aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                }
            }
        }
        System.out.println("Los números ordenados de Menor a Mayor son: "+Arrays.toString(vector));
        
        for(int i = 0; i < 4; i++){
            for (int j = i+1; j < 5 ; j++) {
                if (vector[j]>vector[i]){
                    int aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                }
            }
        }
        System.out.println("Y de Mayor a Menor: "+Arrays.toString(vector));
    }
}