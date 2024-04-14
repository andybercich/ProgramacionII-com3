package Programacion.Relaciones.Agregacion;

import java.util.ArrayList;

public class Departamento {

    private ArrayList <Empleado> empleados;
    private String nombreDepartamento;

    public Departamento (String nombreDepartamento){

        this.nombreDepartamento = nombreDepartamento;
        empleados = new ArrayList<>();

    }
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }

    public void getEmpleados() {

        for(Empleado e: empleados){

            System.out.println(e.getDatos());

        }

    }
    public void borrarEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = new ArrayList<>();
        System.out.println("Se han borrado todos los empleados");
    }
    public String getDatos(){

        return "Departamento: "+ this.getNombreDepartamento()+ " Cantidad empleados: "+ empleados.size();

    }
}
