package Programacion.Relaciones.AsociacionUnidireccional;

public class Estudiante {

    private String nombre;
    private Universidad universidadEstudiante;

    public Estudiante(String nombre, Universidad universidadEstudiante){

        this.nombre = nombre;
        this.universidadEstudiante = universidadEstudiante;

    }

    public String getNombre() {
        return nombre;
    }

    public Universidad getUniversidadEstudiante() {
        return universidadEstudiante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUniversidadEstudiante(Universidad universidadEstudiante) {
        this.universidadEstudiante = universidadEstudiante;
    }

    public void getDatos(){

        System.out.println("El estudiante "+ this.getNombre()+ " va a la universidad "+ this.getUniversidadEstudiante().getNombre());

    }
}
