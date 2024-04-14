package Programacion.Relaciones.Agregacion;

public class Empleado {

    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo){

        this.cargo = cargo;
        this.nombre = nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDatos(){

        return "Empleado: " + this.getNombre()+ " Cargo: "+ this.getCargo();

    }
}
