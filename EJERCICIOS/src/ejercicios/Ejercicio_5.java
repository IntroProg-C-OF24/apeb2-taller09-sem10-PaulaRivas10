/*
Ejercicios 5
El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar 
el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes 
estadísticas en función a los promedios obtenidos del ciclo por estudiantes 
(use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el 
valor, si se debe autogenerar).

Promedio del ciclo, del paralelo C.
Listado de estudiantes con su nota por encima del promedio.
Listado de estudiantes con su nota por debajo del promedio.
Estudiante con la mejor calificación.
Estudiante con la calificación mas baja.
 */
package ejercicios;

public class Ejercicio_5 {

    public static void main(String[] args) {
        int limEst = 28;
        double notasEst[] = new double[limEst];
        double sumaNotas = 0, promedio, notaMayor, notaMenor;
        int mejorEstudiante = 0, peorEstudiante = 0; 
        
        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i] = (double) (Math.random() * (9 - 0 + 1) + 0);
        }
        System.out.println("============LISTADO DE NOTAS============");
        for (int i = 0; i < notasEst.length; i++) {
            System.out.printf("%s %d:%.2f \n", "Nota del Estudiante", (i + 1), notasEst[i]);
        }
        for (int i = 0; i < notasEst.length; i++) {
            sumaNotas += notasEst[i];
        }
        promedio = sumaNotas / notasEst.length;
        System.out.printf("Promedio: %.2f \n", promedio);
        
        notaMayor = notasEst[0];
        notaMenor = notasEst[0];
        
        for (int i = 1; i < notasEst.length; i++) {
            
            if (notasEst[i] > notaMayor);
            notaMayor = notasEst[i];
            mejorEstudiante = i;
            
            if (notasEst[i] < notaMenor);
            notaMenor = notasEst[i];
            peorEstudiante = i;
        }
        System.out.println("Nota menor: " + notaMenor);
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("==============Notas mayores al promedio============");
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > promedio) {
                System.out.printf("Estudiante %d: %.2f \n", (i + 1), notasEst[i]);
            }
        }
         System.out.println("==============Notas menores al promedio============");
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] < promedio) {
                System.out.printf("Estudiante %d: %.2f \n", (i + 1), notasEst[i]);
            }
        }
        System.out.printf("MEJOR ESTUDIANTE: %d con una nota de: %.2f \n", (mejorEstudiante + 1), notaMayor);
        System.out.printf("PEOR ESTUDIANTE: %d con una nota de: %.2f \n", (peorEstudiante + 1), notaMenor);
      
    
    }
}



    

