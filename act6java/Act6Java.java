/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6java;

import java.util.Scanner;
/**
 *
 * @author JulioLopez
 */
public class Act6Java{
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alumno alumno = new Alumno();
        System.out.print("Nombre del alumno: ");
        alumno.nombre = entrada.next();
        Double promedio = promedio(alumno.calificacion);
        String calificacion = calificacion(promedio);
        imprimirCalificacion(alumno, promedio, calificacion);

    }

    public static Double promedio(Double[] calificacion) {
        Scanner entrada = new Scanner(System.in);
        double promedio = 0;
        for(int i=0;i<5;i++) {
            System.out.print("Ingrese calificacion " + (i+1) + ": ");
            calificacion[i] = entrada.nextDouble();
            promedio = promedio + calificacion[i];
        }
        promedio = promedio / 5;
        return promedio;
    }

    public static String calificacion(Double promedio) {
        String calificacion = "";
        if (promedio <= 50) {
            calificacion = "F";
        }
        if (promedio >= 51 && promedio <= 60) {
            calificacion = "E";
        }
        if (promedio >= 61 && promedio <= 70) {
            calificacion = "D";
        }
        if (promedio >= 71 && promedio <= 80) {
            calificacion = "C";
        }
        if (promedio >= 81 && promedio <= 90) {
            calificacion = "B";
        }
        if (promedio >= 91 && promedio <= 100){
            calificacion = "A";
        }
        System.out.println(" Calificación: " + calificacion);

        return calificacion;
    }

    public static void imprimirCalificacion(Alumno alumno, Double promedio, String calificacion) {
        System.out.println("------------------------------");
        System.out.println("Nombre del estudiante: " + alumno.nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
        }
    }


