package Programacion.EjercicioHerencia;

public class Camion extends Vehiculo {

    private double carga;

    public Camion(String duenio, int puertas , int ruedas,double carga) {
        super(duenio, ruedas, puertas);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void Cargar (double carga){
        this.carga+=carga;
    }

    @Override
    void Caracteristicas() {
        if(carga >1500){
            System.out.println("Esta sobrecargado el camion");
        }else {

            System.out.println("La carga es ideal");

        }
    }

}
