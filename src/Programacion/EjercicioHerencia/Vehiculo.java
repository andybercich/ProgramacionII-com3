package Programacion.EjercicioHerencia;

abstract class Vehiculo {

    private String duenio;
    private int ruedas;
    private int puertas;

    public Vehiculo (String duenio, int ruedas, int puertas){

        this.duenio = duenio;
        this.ruedas = ruedas;
        this.puertas = puertas;

    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    abstract void Caracteristicas();


}
