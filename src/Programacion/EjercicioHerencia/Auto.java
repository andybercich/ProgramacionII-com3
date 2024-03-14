package Programacion.EjercicioHerencia;

public class Auto extends Vehiculo{

    private boolean descapotable;

    public Auto (String duenio,int puertas,boolean descapotable) {
        super(duenio, 4, puertas);
        this.descapotable  = descapotable;

    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public boolean getDescapotable(){return descapotable;}

    public void bajar (){ System.out.println("Me bajé");}

    public void subir (){ System.out.println("Me subí");}

    @Override
    void Caracteristicas() {
        System.out.print("Ruedas: " + this.getRuedas() + " Puertas: "+ this.getPuertas()+ " Duenño: "+ this.getDuenio());
        if (descapotable){
            System.out.print(" y es descapotable");
        }else {
            System.out.print(" no es descapotable");
        }
        System.out.println(" ");
    }
}
