package Programacion.EjercicioArreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class arreglos {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1 y 2

        int mayorNum = 0;
        int mayorPrimo = 0;
        int indiceMayor = -1;
        int indiceMayorPrimo = -1;

        int [] arrayEnteros =new int[10];

        for (int i = 0; i <10; i++){

            System.out.println("Ingresa un número entero");
            arrayEnteros[i] = sc.nextInt();

        }

        for (int i = 0; i<arrayEnteros.length; i++){
            if (mayorNum<arrayEnteros[i]){
                mayorNum = arrayEnteros[i];
                indiceMayor = i;
            }
            if ( arrayEnteros[i] > mayorPrimo && esPrimo(arrayEnteros[i])){

                mayorPrimo = arrayEnteros[i];
                indiceMayorPrimo = i;

            }
        }

        System.out.println("El número más alto ingresado es: "+ mayorNum+ " y se encuentra en la posición: "+ indiceMayor);
        System.out.println("El número primo más alto ingresado es: "+ mayorPrimo+ " y se encuentra en la posición: "+indiceMayorPrimo);


        //Ejercicio 3

        int [] numeroPrimos = new int[10];
        int max = 300;
        int min = 100;
        int cont = 0;



        while(min < max){

            if (esPrimo(min) && cont <10){

                numeroPrimos[cont] = min;
                cont+=1;
            }

            min +=1;

        }

        for(int i = 0; i <numeroPrimos.length; i++){
            System.out.println(numeroPrimos[i]);
        }

        //Ejercicio 5

        int [] numeroCuatro = new int[10];
        ArrayList<Integer> indicesCuatro = new ArrayList<>();

        for (int i = 0; i <numeroCuatro.length;i++){

            System.out.println("Ingresa un número entero: ");
            numeroCuatro[i] = sc.nextInt();
            if (terminaCuatro(numeroCuatro[i])){

                indicesCuatro.add(i);

            }

        }

        for (int i : indicesCuatro){

            System.out.println("Hay un número que termina en 4 en la posición "+ i);
            System.out.println("El cual es: "+ numeroCuatro[i]);

        }


        //Ejericicio 5

        int [] numRepetido = new int[10];
        int numMayor = 0;
        int contRep = 0;

        for(int i = 0; i <10;i++){

            System.out.println("Ingresa un número entero: ");
            numRepetido[i] = sc.nextInt();
            if (numMayor < numRepetido[i]){
                numMayor = numRepetido[i];
            }
        }

        for(Integer i : numRepetido){

            if (i == numMayor){

                contRep+=1;
            }


        }
        System.out.println("El numero más grande "+ numMayor+ " se repite en el array un total de "+ contRep);










    }

    public static boolean esPrimo(int num){
        int aux = 1;
        int dividendos = 0;

        if (num > 0) {
            while (aux <= num) {

                if (num % aux == 0) {

                    dividendos += 1;

                }

                aux += 1;
            }
        }

        return dividendos <= 2;


    }

    public static boolean terminaCuatro(int num){

        String numStr = Integer.toString(num);
        return numStr.endsWith("4");


    }

}
