package Programacion.PersonajesJuego;

 class Warrior extends BaseCharacter{

    private String gun;
    private boolean shield;

    public Warrior(String name, int level, String gun, boolean shield) {

        super(name, level, 300, 60);
        this.gun =gun;
        this.shield = shield;

    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    @Override
    public void Defender(double damage) {

        if (damage < this.getHp()) {
            if (shield) {

                double totalDamage = damage - 20;
                this.setHp(this.getHp()-totalDamage);
                shield = false;
                System.out.println("El guerrero ha perdido el escudo, y ha recibido "+ totalDamage+ " de daño"+ " le " +
                        "quedan "+ this.getHp()+ " de vida");

            } else {

               this.setHp(this.getHp() - damage);
                System.out.println("El guerrero a recibido el total de daño del ataque "+ damage+ " al guerrero le " +
                        "quedan "+ this.getHp()+ " de vida");

            }

        }else {
            this.setHp(0);
            System.out.println("El guerrero "+ this.getName() +" ha muerto");

        }
    }

    @Override
    public int Atacar(BaseCharacter b) {
        if (this.getHp()>0){

        double totalDamage = this.getDamageCharacter() * (1 + (this.getLevel() / 100.0));
        System.out.println("El guerrero "+ this.getName()+ " ha atacado a "+ b.getName()+ " con un daño de "+ totalDamage);

        b.Defender(totalDamage);

        }else {
            System.out.println("El guerrero "+ this.getName()+ " no puede atacar, esta muerto");
        }


        return 0;
    }
}
