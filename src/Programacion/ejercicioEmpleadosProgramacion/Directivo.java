package Programacion.ejercicioEmpleadosProgramacion;

public class Directivo extends Empleado {

    private String departamento;

    public Directivo (){

    }

    public Directivo (String nombre, String departamento){
        super(nombre);
        this.departamento = departamento;

    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public Operario CambiarAreaOperario(String nuevaArea, Operario o){

        o = new Operario(o.getNombre(), nuevaArea);
        return o;

    }

    public Oficial cambiarAreaOficial(String nuevaArea, Oficial o ){

        o = new Oficial(o.getNombre(), nuevaArea, o.getCargo());
        return o;

    }

    public Oficial CambiarCargoOficial (String nuevoCargo, Oficial o ){

        o = new Oficial(o.getNombre(), o.getArea(), nuevoCargo);
        return o;

    }


    @Override
    public String toString() {
        return "Nombre Directivo: "+ this.getNombre() + " Departamento:"+ this.departamento;
    }



}
