package Programacion.Relaciones.AsociacionBidireccional;

import java.util.ArrayList;

public class Libro {

    private ArrayList<Persona> arrayPersona = new ArrayList<>();
    private String  titulo;

    public Libro(String titulo){

        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void getArrayPersona() {
        for (Persona persona : arrayPersona) {

            System.out.println(persona.getNombre());

        }
    }

    public void agregarLector(Persona persona) {
        arrayPersona.add(persona);
    }

    public void borrarArrayPersona() {

        this.arrayPersona = new ArrayList<>();

    }
}
