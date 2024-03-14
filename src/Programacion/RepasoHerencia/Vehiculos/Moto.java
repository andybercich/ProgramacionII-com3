package Programacion.RepasoHerencia.Vehiculos;


class Moto extends Bici {

    private double cc;
    private double velocidadKmH;


    public Moto(String color, boolean tipo, double cc, double velocidadKmH) {
        super(color, tipo);
        this.velocidadKmH = velocidadKmH;
        this.cc = cc;


    }

    public double getVelocidadKmH() {
        return velocidadKmH;
    }

    public double getCc() {
        return cc;
    }

    public void setVelocidadKmH(double velocidadKmH) {
        this.velocidadKmH = velocidadKmH;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public String Datos() {

        if (getTipo()) {
            return "La moto tiene " +this.getRuedas()+ " ruedas, es de tipo deportiva" +", con una cilindrada de " + getCc() +
                    " y es de color "+ this.getColor();
        } else {
            return "La moto tiene " +this.getRuedas()+ " ruedas, es de tipo urbana" +", con una cilindrada de " + getCc() +
                    " y es de color "+ this.getColor();
        }
    }


}
