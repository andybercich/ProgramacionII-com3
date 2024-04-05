package Programacion.PersonajesJuego;

public class mainJuego {
    public static void main(String[] args) {

        Warrior guerrero = new Warrior("Gertrudis", 5, "Hacha", true);

        Wizzard mago = new Wizzard("Felipe", 6);

        Rogue picaro = new Rogue("Antonio", 15);


        picaro.Atacar(mago);

        picaro.setNumBerser();

        mago.Atacar(picaro);

        mago.Atacar(picaro);

        mago.Atacar(picaro);

        System.out.println(mago.getMagic());






    }
}
