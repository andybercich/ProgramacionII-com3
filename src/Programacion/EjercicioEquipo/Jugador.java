package Programacion.EjercicioEquipo;

public class Jugador {
    private String position;
    private int numPlayer;
    private String name;

    public Jugador(String position, int numPlayer, String name){

        this.position = position;
        this.numPlayer = numPlayer;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public String getPosition() {
        return position;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDatos(){

        return "Nombre: " + this.getName()+ " Numero: "+ this.getNumPlayer()+ " Posición: "+ this.getPosition();

    }

}
