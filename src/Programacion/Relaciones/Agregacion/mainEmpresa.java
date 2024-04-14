package Programacion.Relaciones.Agregacion;

public class mainEmpresa {
    public static void main(String[] args) {

        Empresa e1 = new Empresa("JYM");
        Departamento d = new Departamento("Marketing");
        Empleado empleado = new Empleado("Andrés", "Director");

        e1.agregarDepartamentos(d);

        d.agregarEmpleado(empleado);
        e1.getDepartamentos();
        System.out.println(d.getDatos());
        d.getEmpleados();
        System.out.println(empleado.getDatos());


    }
}
