package Programacion.EjercicioArreglos;

public class arreglos {



    public static void main(String[] args) throws ExcepcionPersonalizada {

        PersonalizedArray personalizedArray1 = new PersonalizedArray(10);
        personalizedArray1.llenarArray();

        for (int p:personalizedArray1){}
        /*
        //Ejercicio 1
        personalizedArray1.mayorNum();
        //Ejercicio 2
        personalizedArray1.mayorPrimo();

        //Ejercicio 3
        int [] numeroPrimos = new int[10];
        int max = 300;
        int min = 100;
        int cont = 0;



        while(min < max){

            if (PersonalizedArray.esPrimo(min) && cont <10){

                numeroPrimos[cont] = min;
                cont+=1;
            }

            min +=1;

        }

        for(int i = 0; i <numeroPrimos.length; i++){
            System.out.println(numeroPrimos[i]);
        }
        */
        //Ejercicio 4

        personalizedArray1.numeroCuatro();

        //Ejercicio 5
        personalizedArray1.repiteMayor();



    }



}
