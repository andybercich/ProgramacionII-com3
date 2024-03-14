package Programacion.RepasoHerencia.Animales;

public class Gato extends Animal{

    private int bigotes;

    public Gato(String nombre, int edad, String genero, int bigotes) {
        super(nombre, edad, genero);
        this.bigotes = bigotes;
    }

    public int getBigotes() {return bigotes;}

    public void setBigotes(int bigotes) {this.bigotes = bigotes;}

    @Override
    void HacerSonido() {
        System.out.println("Miaaaaaauuu");
    }

    void Informacion() {
        System.out.println("Nombre: "+ this.getNombre()+ " Edad: "+ this.getEdad() + " Género: "+ this.getGenero()+
                " Bigotes: "+ this.bigotes);
    }
}
