/*
Ejercicio 1
Genera una aplicación que permita ingresar valores a un arreglo de cadenas.
El arreglo almacena el número de elementos que el usuario lo disponga. 
Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe 
permitir ingresar ese número elementos.
Considerar las siguientes excepciones, no se contabilizan dentro del número de 
elementos, marcas que empiecen con las letras A, C, T.
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de marcas de vehiculos:");
        int lim = teclado.nextInt();
        System.out.println("   ADVERTENCIA: Las letras A, C, T no se contabilizan");
        teclado.nextLine();
        String[] marcas = new String[lim];
        
        for (int i = 0; i < lim;) {
            System.out.print("Ingrese la marca del vehiculo " + (i + 1) + ": ");
            String marca = teclado.nextLine();
            if (! (marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T")) ) {
                marcas[i] = marca;
                i++;
            } else {
                System.out.println("---> Escribe otra marca");
            }
        }
        System.out.println("_______LAS MARCAS DE LOS VEHICULOS SON______");
        for (int i = 0; i < marcas.length; i++) {
            System.out.println("- " + marcas[i]);
            }
        }
    }
