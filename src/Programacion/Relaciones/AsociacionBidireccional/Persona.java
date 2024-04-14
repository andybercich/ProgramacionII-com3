package Programacion.Relaciones.AsociacionBidireccional;

import java.util.ArrayList;

public class Persona {

    private String nombre;

    private ArrayList <Libro> arrayLibros = new ArrayList<>();

    public Persona(String nombre){

        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getArrayLibros() {

        for (Libro arrayLibro : arrayLibros) {

            System.out.println(arrayLibro.getTitulo());

        }

    }

    public void agregarLibros(Libro libro){

        arrayLibros.add(libro);

    }

    public void borrarArrayLibro(){
        arrayLibros = new ArrayList<>();
    }
}
