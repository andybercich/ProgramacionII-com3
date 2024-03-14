package Programacion.RepasoHerencia.Animales;

abstract public class Animal {

    private String nombre;
    private int edad;
    private String genero;

    public Animal(String nombre, int edad, String genero){

        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;

    }

    public int getEdad() {return edad;}

    public String getNombre() {return nombre;}

    public String getGenero() {return genero;}

    public void setEdad(int edad) {this.edad = edad;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setGenero(String genero) {this.genero = genero;}

    abstract void HacerSonido ();

    abstract void Informacion();

}
