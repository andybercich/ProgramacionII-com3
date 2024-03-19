package Programacion.ejercicioEmpleadosProgramacion;

public class Operario extends Empleado{

    private String area;

    public Operario (){}

     public Operario (String nombre, String area){
         super(nombre);
         this.area = area;

     }

    public String getArea() {
        return area;
    }

    public void Avance (int num){
        System.out.println("Quedan: "+ num+ " para terminar el proyecto");
    }

    @Override
    public String toString() {
        return "Nombre Operario: "+ this.getNombre()+ " Area: "+ this.area;
    }
}
