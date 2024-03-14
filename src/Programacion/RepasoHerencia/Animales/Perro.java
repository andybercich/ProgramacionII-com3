package Programacion.RepasoHerencia.Animales;

public class Perro extends Animal{

    private String raza;

    public Perro(String nombre, int edad, String genero, String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    @Override
    void HacerSonido() {
        System.out.println("Guau Guauu");
    }

    void Informacion() {
        System.out.println("Nombre: "+ this.getNombre()+ " Edad: "+ this.getEdad() + " Género: "+ this.getGenero()+
                " Raza: "+ this.raza);
    }

}
