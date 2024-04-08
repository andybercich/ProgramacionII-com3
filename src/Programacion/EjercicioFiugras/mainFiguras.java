package Programacion.EjercicioFiugras;

public class mainFiguras {
    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado(10.5);
        System.out.println("El area del cuadrado es: " + c1.CalcularArea());
        c1.Dibujar();
        c1.Rotar();
        Circulo cir1= new Circulo(12.5);
        System.out.println("El area del circulo es: "+ cir1.CalcularArea());
        cir1.Dibujar();



    }
}
