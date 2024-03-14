package Programacion.RepasoHerencia.Animales;

public class Pajaro extends Animal{



    private String especie;

    public Pajaro (String nombre, int edad, String genero , String especie){
        super(nombre, edad,genero);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    void HacerSonido() {
        System.out.println("Fiiiiiuuuuu fiiiuuu");
    }

    @Override
    void Informacion() {
        System.out.println("Nombre: "+ this.getNombre()+ " Edad: "+ this.getEdad() + " Género: "+ this.getGenero()+
                " Especie: "+ this.especie);
    }
}
