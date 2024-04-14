package Programacion.Relaciones.Compocision;

public class mainCasa {
    public static void main(String[] args) {

        Casa c = new Casa(4);
        c.agregarPuerta("Roble");
        c.agregarPuerta("Roble");
        c.agregarPuerta("Pino");
        c.agregarPuerta("Algarrobo");
        c.setCantPuertas(5);

        c.agregarPuerta("Cirzo");

        c.getPuertas();

        c.setCantPuertas(3);
        c.getPuertas();

    }
}
