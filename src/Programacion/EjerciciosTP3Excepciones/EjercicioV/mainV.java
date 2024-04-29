package Programacion.EjerciciosTP3Excepciones.EjercicioV;

import Programacion.EjercicioVI.PersonalizedException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class mainV {
    public static void main(String[] args) throws PersonalizedException{
        String name;
        String nameAlum;
        int option=1;
        int age = 0;
        double mark = 0;
        Scanner sc = new Scanner(System.in);
        School school1 = new School();


        System.out.println("Bienvenido usuario, Ingresa el nombre de la escuela que quieres crear!!!");
        name = sc.nextLine();

        if(name.isEmpty() || (name.contains(" ")&& name.length()==1)){
            throw new PersonalizedException("HAS INGRESADO UN ESPACIO VACIO EN NOMBRE");
        }
        school1.setName(name.toUpperCase(Locale.ROOT));
        System.out.println("Muy bien!  Has creado la escuela: "+ school1.getName());
        while(option !=0){

            System.out.println("Ingresa lo que deseas hacer con la escuela: ");
            System.out.println("1) Agregar Alumno");
            System.out.println("2) Mostrar Alumnos");
            System.out.println("3) Mostrar Promedio de Todos los Alumnos");
            System.out.println("4) Mostrar Alumno con la nota más Alta");
            System.out.println("5) Buscar Alumno por Nombre");
            System.out.println("0) SALIR");

            try {
                option = sc.nextInt();
            }catch (InputMismatchException i){
                throw new PersonalizedException("HAS INGRESADO UNA LETRA O UN NÚMERO CON COMA EN LUGAR DE UNA OPCIÓN");
            }

            if (option == 1){

                do {
                    System.out.println("Perfecto, ingresa el nombre del alumno (NO SE ACEPTAN ESPACIOS VACIOS): ");
                    nameAlum = sc.nextLine().toUpperCase();

                }while (nameAlum.isEmpty() || (nameAlum.contains(" ")&& nameAlum.length()==1));



                do {

                    System.out.println("Muy bien, ahora ingresa su edad (EDADES MAYORES A CERO Y MENORES A 100): ");
                    try {
                        age = sc.nextInt();
                    }catch (InputMismatchException ie){
                        throw new PersonalizedException("HAS INGRESADO UN NÚMERO CON COMA O UNA LETRA EN LUGAR DE UNA EDAD CORRECTA");
                    }

                }while (age<0 || age >100);

                do{
                    System.out.println("Ingresa su nota (Mayor a 1, menor a 11");
                    try {
                        mark = sc.nextDouble();
                    }catch (InputMismatchException i){

                        throw new PersonalizedException("HAS INGRESADO UNA LETRA EN LUGAR DE UN NÚMERO");

                    }
                }while (mark>10 || mark<1);


                System.out.println("PERFECTO, SE HAN CARGADO CORRECTAMENTE TODOS LOS DATOS!!");

                school1.addStudent(new Student(nameAlum, age, mark));



            } else if (option == 2) {
                
                school1.showStudents();
            } else if (option == 3) {

                System.out.println("El promedio de la nota de todos los alumnos es: "+ school1.averageScore());
                
            } else if (option == 4) {

                school1.highestMark();

            } else if (option == 5) {

                sc.nextLine();
                System.out.println("Ingresa el nombre de estudiante a buscar: ");
                name = sc.nextLine().toUpperCase();

                if (!school1.searchNameStudent(name)) {
                    System.out.println("No se consiguio encontrar el alumno "+ name +" correctamen :(");
                }else{
                    school1.searchNameStudent(name);
                }

            }else {
                System.out.println("Gracias por usar mi aplicacion");
                break;
            }


        }


    }
}
