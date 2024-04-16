package Programacion.EjercicioEquipo;

public class mainTeam {

    public static void main(String[] args) {


        Equipo equipo1 = new Equipo();
        equipo1.agregarElemento(new Jugador("Delantero", 7, "Felipe"));
        equipo1.agregarElemento(new Jugador("Defensor", 3, "Ulises"));
        equipo1.agregarElemento(new Jugador("Arquero", 1, "Gustavo"));

        for (Jugador j : equipo1){}


    }

}
