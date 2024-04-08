package Programacion.EjercicioFiugras;

public class Circulo implements Figuras, Dibujable{
    private double radio;

    public Circulo (double radio){

        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI * radio;
    }

    @Override
    public void Dibujar() {
        System.out.println("0");
    }
}
