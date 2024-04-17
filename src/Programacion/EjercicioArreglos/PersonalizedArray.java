package Programacion.EjercicioArreglos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PersonalizedArray implements Iterable<Integer>{

    private ArrayList<Integer> arrayNum = new ArrayList<>();
    private int cant;

    public PersonalizedArray (int cant) throws ExcepcionPersonalizada {

        if (cant <1){
            throw new ExcepcionPersonalizada("La cantidad no puede ser menor o igual a 0");
        }

        this.cant = cant;


    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    public void llenarArray() {
        Scanner sc = new Scanner(System.in);
        arrayNum = new ArrayList<>();
        for (int i = 0; i<cant; i++){

            System.out.println("Ingrese un número entero: ");
            arrayNum.add(sc.nextInt());
        }
        System.out.println("Se ha llenado el array");


    }


    @Override
    public Iterator<Integer> iterator() {
        try {

            if (!arrayNum.isEmpty()) {

                return new MiIterador(arrayNum);

            } else {

                throw new ExcepcionPersonalizada("El array está vacío, primero debés llenarlo");
            }

        } catch (ExcepcionPersonalizada e) {

            System.out.println(e.getMessage());
            return null;

        }
    }

    public void mayorNum(){
        int num = -1;
        for(int i:arrayNum){

            if (i > num){

                num = i;

            }

        }

        System.out.println("El numero más grande del array se encuentra en la posición "+ arrayNum.indexOf(num)+ " y " +
                "es el número "+ num);

    }

    public void mayorPrimo(){

        int mayorPrimo = -1;

        for (int i : arrayNum){

            if (esPrimo(i) && i>mayorPrimo){

                mayorPrimo = i;

            }

        }
        if (mayorPrimo == -1){
            System.out.println("El array no tiene numeros primos");
        }else {
            System.out.println("El número primo más grande es " + mayorPrimo + " y se encuentra en la posición " + arrayNum.indexOf(mayorPrimo));
        }

    }

    public void numeroCuatro(){
        boolean aux = false;
        for(int i : arrayNum){

            if (terminaCuatro(i)){

                System.out.println("El numero "+ i+ " termina en cuatro, y se encuentra en la posicion "+ arrayNum.indexOf(i));
                aux = true;
            }

        }
        if (!aux){

            System.out.println("El array no tiene números terminados en cuatro");

        }

    }

    public void repiteMayor(){

        int mayor = 0;
        int cont = 0;

        for (int i : arrayNum){

            if (i > mayor){

                mayor = i;

            }

        }
        for (int i : arrayNum){

            if (i == mayor){

                cont+=1;

            }

        }

        System.out.println("El array tiene "+ cont +" vez/veces repetido el numero mayor : "+ mayor);



    }

    private boolean terminaCuatro(int num){

        String numStr = Integer.toString(num);
        return numStr.endsWith("4");


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
        }else if (num==0) {
            return false;
        }

        return dividendos <= 2;


    }

    public class MiIterador implements Iterator<Integer> {

        private List<Integer> enteros;
        private int indice = 0;

        public MiIterador(List<Integer> enteros) {

            this.enteros = enteros;

        }

        @Override
        public boolean hasNext() {
            return indice < enteros.size();
        }

        @Override
        public Integer next() {

            System.out.println("En la posicion "+ indice+ " tenemos el numero: "+ enteros.get(indice));

            return enteros.get(indice++);
        }
    }


}
