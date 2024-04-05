package Programacion.PersonajesJuego;

public abstract class BaseCharacter implements Character{

    private String name;

    private double hp = 200;

    private int level;

    private final double damageCharacter;

    public BaseCharacter(String name ,int level,double hp, double damageCharacter) {

        this.hp += hp;
        this.name = name;
        this.level = level;
        this.damageCharacter = damageCharacter;

    }

    public double getDamageCharacter() {
        return damageCharacter;
    }

    public double getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

}
