package Programacion.Relaciones.Agregacion;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Departamento> departamentos;
    private String nombre;

    public Empresa(String nombre){

        this.nombre = nombre;
        departamentos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void getDepartamentos() {

        for(Departamento d: departamentos){

            System.out.println(d.getDatos());

        }

    }

    public void agregarDepartamentos(Departamento d){

        departamentos.add(d);

    }

    public void borrarDepartamentos(){

        this.departamentos = new ArrayList<>();


    }

}
