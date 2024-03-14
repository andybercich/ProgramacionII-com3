package Programacion.EjercicioHerencia;

public class Hermain {
    public static void main(String[] args) {

        Auto a = new Auto("Andy", 2, true);
        a.Caracteristicas();
        Camion c = new Camion("Jorge", 4, 8,550);
        c.Caracteristicas();
        System.out.println(c.getDuenio());

    }
}
