package Programacion.Relaciones.AsociacionUnidireccional;

public class mainUniver {
    public static void main(String[] args) {


        Universidad uni1 = new Universidad("UTN");
        Estudiante est1 = new Estudiante("Andrés", uni1);
        Universidad uni2 = new Universidad("UNCUYO");
        est1.getDatos();
        est1.setUniversidadEstudiante(uni2);
        est1.getDatos();

    }
}
