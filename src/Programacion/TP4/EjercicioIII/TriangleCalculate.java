package Programacion.TP4.EjercicioIII;

import Programacion.EjercicioVI.PersonalizedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleCalculate {
    public static void main(String[] args) throws PersonalizedException {
        Scanner sc = new Scanner(System.in);
        String baseStr = "";
        String heigthStr = "";
        double base;
        double heigth;

        System.out.println("Hola usuario!! ");
        System.out.println("Este programa te mostrará la base de un triangulo");

        System.out.println("Ingresa la base del triangulo");
        baseStr = sc.nextLine();
        if (baseStr.contains(" ")){
            throw new PersonalizedException("SE HA INGRESADO UN ESPACIO EN BLACO");
        }
        try {
            base = Double.parseDouble(baseStr);
        }catch (NumberFormatException i){
            throw new PersonalizedException("HAS INGRESADO UN DATO DE TIPO STRING EN LUGAR DE DOUBLE/INT");
        }

        System.out.println("Ingresa la altura del triangulo");
        heigthStr = sc.nextLine();
        if (heigthStr.contains(" ")){
            throw new PersonalizedException("SE HA INGRESADO UN ESPACIO EN BLACO");
        }
        try {
            heigth = Double.parseDouble(heigthStr);
        }catch (NumberFormatException i){
            throw new PersonalizedException("HAS INGRESADO UN DATO DE TIPO STRING EN LUGAR DE DOUBLE/INT");
        }

        Triangle t = new Triangle(base, heigth);
        t.calculateArea();






    }


    static class Triangle {

        private double base;
        private double heigth;

        public Triangle(double base, double heigth){
            this.base = base;
            this.heigth = heigth;
        }

        public void calculateArea(){
            System.out.println("El area del triangulo es: "+ ((base*heigth)/2));
        }



    }
}
