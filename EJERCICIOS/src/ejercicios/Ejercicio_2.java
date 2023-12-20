/*
Ejercicio 2
Dado el arreglo; determinar cuantos elementos están arriba de la media
aritmética y cuantos están por debajo de la medía aritmética.

int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 */
package ejercicios;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int mayorMedia = 0, menorMedia = 0;
        double suma = 0.0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double mediaArit = suma / arreglo.length;
        System.out.printf("MEDIA ARITMETICA: %.2f%n", mediaArit);

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mediaArit) {
                mayorMedia++;
            } else if (arreglo[i] < mediaArit) {
                menorMedia++;
            }
        }
        System.out.println("Los promedios por encima: " + mayorMedia);
        System.out.println("Los promedios por debajo: " + menorMedia);
    }
}
