package Programacion.PersonajesJuego;

public class Wizzard extends BaseCharacter{

    private int magic = 150;
    private int magicShield = 150;


    public Wizzard(String name, int level) {
        super(name, level, 150, 80);
    }


    public int getMagic() {

        return magic;

    }
    public int getMagicShield() {

        return magicShield;

    }

    public void increaseMagic() {
        if (this.getHp() > 40){
            this.magic += 100;
            this.setHp(this.getHp()-60);
            System.out.println("El mago ha incrementado su magia en 100, dandole un total de: "+ this.getMagic()+ " " +
                    "ha perdido 40 de vida, un total de "+ this.getHp());

        } else if (this.getHp() == 0) {

            System.out.println("El mago "+this.getName()+ "no puede incrementar su magia, ha muerto");

        }else {
            System.out.println("El mago "+ this.getName()+ " no puede incrementar su magia, debe tener más de 40 de " +
                    "vida: " +this.getHp());
        }
    }

    public void setMagicShield() {
        if (this.getHp() > 0){
            if (this.getMagic() >= 50) {

                 this.magicShield += 100;
                 this.magic-=50;

                System.out.println("El mago ha incrementado su escudo Magico en 100, dandole un total de: "+ this.getMagicShield()+ " " + "ha perdido 50 de magia, un total de "+ this.getMagic());

            } else {
            System.out.println("No se puede incrementar escudo mágico, el mago tiene "+ this.getMagic() + " de magia," +
                    " se necesita 50 de magia");
            }
        }else {

            System.out.println("El hechizero "+ this.getName()+ " está muerto, no puede recargar su escudo");
        }

    }


    @Override
    public void Atacar(BaseCharacter b) {
        if(this.getHp() >0){

        if (this.magic >= 30){

            System.out.println("El mago ha utilizado Ataque Mágico, realizando 80 de daño a "+ b.getName());
            b.Defender(this.getDamageCharacter());
            this.magic -=30;


        }else {

            System.out.println("El mago ha realizado un Ataque Comun (no posee suficiente magia), realizando 35 de " +
                    "daño ");
            b.Defender(40);

        }
        }else {
            System.out.println("El hechizero "+ this.getName()+ " está muerto, no puede atacar");
        }


    }

    @Override
    public void Defender(double damage) {

        if (damage< this.getHp()){

            if (magicShield >=30){

                this.setHp(this.getHp()-(damage-30));

                System.out.println("El mago"+ this.getName() + " ha usado parte de su escudo mágico, recibiendo "+ (damage-30)+
                        " de " +
                        "daño" + " " +
                        "Le quedan "+ this.getHp() + " de vida");

                magicShield-=30;


            }else {

                this.setHp(this.getHp()-damage);
                System.out.println("El mago"+ this.getName() + " ha recibido el total de daño de "+ damage+
                        "Le quedan "+ this.getHp() + " de vida");


            }



        }else {

            System.out.println("El mago " + this.getName()+ " ha muerto");
            this.setHp(0);

        }



    }
}
