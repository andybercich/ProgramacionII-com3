package Programacion.ejercicioEmpleadosProgramacion;

public class ejercicioMain {
    public static void main(String[] args) {

        Directivo d = new Directivo("Andy", "Telecomunicaciones");
        Operario o = new Operario("Jorge", "Mantenimiento de antenas");
        Oficial oficia1 = new Oficial("Felipe", "Mantenimiento Antenas", "Gerente");
        Tecnico t1 = new Tecnico("Juan", "Mantenimiento Antenas", "Verificar Cableado cúpula");

        oficia1 = d.cambiarAreaOficial("Mantenimiento Calefaccion", oficia1);
        t1 = oficia1.CambiarTareaTecnico("Reemplazar cable",t1);

        Empleado [] arrayEm = new Empleado[4];
        arrayEm [0] = d; arrayEm[1] = o; arrayEm[2] = oficia1; arrayEm[3] = t1;



        for (Empleado a : arrayEm){

            System.out.println(a.toString());

        }




    }
}
