/*
Ejercicios 4
Analice el siguiente código

Scanner entrada = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", 
"Jennifer", "Alcides"};
String inicial;
boolean bandera = true;
while(bandera){
    System.out.println("Ingrese una letra");
    inicial = entrada.nextLine();
 }
Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario 
ingrese por teclado una letra que coincida con alguna de las primeras letras de 
los nombres del arreglo estudiantes. Debe usar un ciclo repetitivo para recorrer
el arreglo estudiantes.
 */
package ejercicios;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String letra;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese una letra: ");
            letra = tecla.nextLine();
            
            for (int i = 0; i < estudiantes.length; i++) {
                if (estudiantes[i].startsWith(letra)) {
                    bandera = false;
                    System.out.println("Fin");
                    break;
                }
            }
        }
    }
}

    

