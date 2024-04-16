package Programacion.EjercicioEquipo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Equipo implements Iterable<Jugador>{

    private ArrayList<Jugador> jugadores;

    public Equipo (){

        jugadores = new ArrayList<>();

    }

    public void agregarElemento(Jugador jugador) {

        jugadores.add(jugador);

    }

    @Override
    public Iterator<Jugador> iterator() {

        return new MiIterador(jugadores);

    }



    public class MiIterador implements Iterator<Jugador> {

        private List <Jugador> equipo;
        private int indice = 0;

        public MiIterador(List<Jugador> equipo) {

            this.equipo = equipo;

        }

        @Override
        public boolean hasNext() {
            return indice < equipo.size();
        }

        @Override
        public Jugador next() {
            System.out.println(equipo.get(indice).getDatos());
            return equipo.get(indice++);
        }
    }



}
