package Programacion.ejercicioEmpleadosProgramacion;

public class Oficial  extends  Operario{

    private String cargo;

    public Oficial (){
    }

    public Oficial (String nombre,String area ,String cargo){
        super(nombre,area);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Nombre Oficial: "+ this.getNombre()+ " Area:"+ this.getArea() +" Cargo:"+ this.cargo;
    }

    public Tecnico CambiarTareaTecnico (String tarea, Tecnico t){

        t = new Tecnico(t.getNombre(),t.getArea(),tarea);
        return t;

    }
}
