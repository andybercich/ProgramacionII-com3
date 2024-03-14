package Programacion.RepasoHerencia.Vehiculos;


class Camion extends Auto {

    private double cargaKg;

    public Camion(String color, int ruedas ,double cc, double velocidadKmH, double carga) {

        super(color,ruedas,cc, velocidadKmH);
        this.cargaKg = carga;

    }

    public double getCarga() {
        return cargaKg;
    }

    public void setCarga(double carga) {
        this.cargaKg = carga;
    }

    @Override
    public String Datos() {
        return "Este camion tiene "+this.getRuedas() + " ruedas, puede llevar carga de hasta " + cargaKg + " kilos" + " con una cilindrada de "+ getCc()+
                " y " +
                "es de color "+ this.getColor();
    }

}
