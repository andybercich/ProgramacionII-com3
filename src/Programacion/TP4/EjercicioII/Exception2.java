package Programacion.TP4.EjercicioII;

import Programacion.TP4.PersonalizedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) throws PersonalizedException {
            double n;
            int posicion;
            String cadena ;
            double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
            System.out.println("Contenido del array antes de modificar:");
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }
            System.out.print("\n\nIntroduce la posición del array a modificar: ");

            cadena = sc.nextLine();

            try {
                posicion = Integer.parseInt(cadena);
            }catch ( NumberFormatException num){
                throw new PersonalizedException("HAS INGRESADO UNA LETRA EN LUGAR DE UN NÚMERO");
            }

            System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");

            try {
                n = sc.nextDouble();
            }catch (InputMismatchException i){
                throw new PersonalizedException("HAS INGRESADO UNA LETRA EN LUGAR DE UN NÚMERO");
            }




            try {
                valores[posicion] = n;
            }catch (ArrayIndexOutOfBoundsException a){
                throw new PersonalizedException("HAS INGRESADO UNA POSICIÓN FUERA DEL ARRAY");
            }


            System.out.println("\nPosición a modificar " + posicion);
            System.out.println("Nuevo valor: " + n);
            System.out.println("Contenido del array modificado:");
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }

        }
}
