package Programacion.TP4.EjercicioI;

import Programacion.EjercicioVI.PersonalizedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameGuess {

    public static void main(String[] args) throws PersonalizedException {
        Scanner sc = new Scanner(System.in);
        int numToGuess = (int) (Math.random() * 100);
        int numUser= 0;
        int tries = 0;
        boolean interrupt = false;

        while (numToGuess!= numUser){

            numUser = setNumUser();
            tries++;


            if (numUser != -1){

                if (numUser > numToGuess){
                    System.out.println("El número mágico es más pequeño que: "+ numUser);

                }else if (numUser<numToGuess){
                    System.out.println("El número mágico es más grande que: "+ numUser);

                }else {
                    System.out.println("LO HAS CONSEGUIDO FELICIDAADEEES!!!");
                    System.out.println("El número mágico era: "+ numUser);
                    System.out.println("Te ha tomado "+ tries+ " intentos");
                }


            }




        }


    }

    public static int setNumUser(){
        Scanner sc = new Scanner(System.in);
        int numUser = 0;
        String numUserStr = "";

        System.out.println("Ingresa un número y te dire si es más grande o más chico que el número mágico: ");
        numUserStr = sc.nextLine();


        try {
            numUser = Integer.parseInt(numUserStr);

            if (numUser <=0){
                System.out.println("NO INGRESES NÚMEROS NEGATIVOS O IGUALES A 0 (CERO)");
                return -1;
            } else if (numUser>=100) {
                System.out.println("LOS NÚMEROS SON MENORES A 100 ");
                return -1;
            }else {
                return numUser;
            }

        }catch (Exception e){
            System.out.println("DEBES INGRESAR UN NÚMERO, NO LETRAS!!!");
            return -1;
        }

    }

}
