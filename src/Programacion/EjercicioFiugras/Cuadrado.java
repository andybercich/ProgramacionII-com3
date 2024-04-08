package Programacion.EjercicioFiugras;

public class Cuadrado implements Figuras, Rotable, Dibujable {

    private double lado;

    public Cuadrado(double lado ){
        this.lado = lado;

    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        return Math.pow(lado,2);
    }

    @Override
    public void Dibujar() {
        System.out.println("  /_7  ");
    }

    @Override
    public void Rotar() {

        System.out.println("El caudrado a rotado");

    }
}
