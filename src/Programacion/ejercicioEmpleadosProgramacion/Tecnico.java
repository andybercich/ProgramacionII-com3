package Programacion.ejercicioEmpleadosProgramacion;

public class Tecnico extends Operario{

    private String trabajoProx;

    public Tecnico (){}

    public Tecnico(String nombre, String area, String trabajoProx){
        super(nombre,area);
        this.trabajoProx = trabajoProx;

    }

    public String getTrabajoProx() {
        return trabajoProx;
    }


    @Override
    public String toString() {
        return "Nombre Tecnico: "+ this.getNombre() + " Area:"+ this.getArea() +" Trabajo Prox: "+ this.trabajoProx;
    }
}
