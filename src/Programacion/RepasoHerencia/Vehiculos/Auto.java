package Programacion.RepasoHerencia.Vehiculos;

class Auto extends Vehiculo {

    private double velocidadKmH;
    private double cc;


    public Auto(String color, int ruedas ,double cc, double velocidadKmH) {

        super(ruedas, color);
        this.cc = cc;
        this.velocidadKmH = velocidadKmH;

    }

    public double getCc() {
        return cc;
    }

    public double getVelocidadKmH() {
        return velocidadKmH;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public void setVelocidadKmH(double velocidadKmH) {
        this.velocidadKmH = velocidadKmH;
    }

    @Override
    public String Datos() {
        return "El auto tiene "+ this.getRuedas() + " ruedas, tiene una velocidad limite de " + velocidadKmH+ " con " +
                "una " +
            "cilindrada de: "+ this.getCc()+ " y es de color " + this.getColor();
    }
}
