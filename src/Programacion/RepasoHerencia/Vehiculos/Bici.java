package Programacion.RepasoHerencia.Vehiculos;

class Bici extends Vehiculo {

    private boolean tipo;

    public Bici(String color, boolean tipo) {
        super(2,color);

        this.tipo = tipo;

    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String Datos() {

        if (tipo) {
            return "La bici tiene " +this.getRuedas()+ " ruedas, es de tipo deportiva" + " y es de color "+ this.getColor();
        } else {
            return "La bici tiene " +this.getRuedas()+ " ruedas, es de tipo urbana" + " y es de color "+ this.getColor();
        }

    }

}
