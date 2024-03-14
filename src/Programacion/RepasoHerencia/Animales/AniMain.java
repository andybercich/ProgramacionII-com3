package Programacion.RepasoHerencia.Animales;

public class AniMain {
    public static void main(String[] args) {

        Pajaro p = new Pajaro("Chico", 3, "Masculino", "7 cuchillos");
        Perro p2 = new Perro("Pichu", 10, "Femenino", "Chow Chow");
        Gato g = new Gato("Batman", 5,"Masculino", 15);

        Animal [] a = new Animal[3];
        a[0] = p; a[1] = p2 ; a[2] = g;

        for (Animal b:a){

            b.HacerSonido();
            b.Informacion();


        }


    }
}
