package Programacion.Relaciones.AsociacionBidireccional;

public class mainLibros {
    public static void main(String[] args) {

        Libro l = new Libro("Don Quijote");
        Persona p = new Persona("Andrés");
        p.agregarLibros(l);
        p.agregarLibros(new Libro("Harry Potter"));
        p.getArrayLibros();

    }
}
