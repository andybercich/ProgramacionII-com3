package Programacion.PersonajesJuego;

public class Rogue extends BaseCharacter{

    private int numBerser;

    public Rogue(String name, int level) {
        super(name, level, 200, 40);
        numBerser = 0;
    }

    public void setNumBerser() {

        if (this.getHp() > 50 && numBerser == 0){

            numBerser = 2;
            this.setHp(this.getHp()-50);
            System.out.println("El picaro "+ this.getName()+ " ha activado el modo Berserker, ahora realizando 100 de" +
                    " daño en 2 ataques, pero queda con un 50 menos de vida: "+ this.getHp());


        }else if (this.getHp() == 0){

            System.out.println("El picaro "+ this.getName()+ " está muerto, no puede utilizar el modo Berserker");

        }else if (this.getHp() >50 && numBerser >0){

            System.out.println("El picaro "+ this.getName()+ " le quedan ataques Berserkers");

        }else {

            System.out.println("El picaro "+ this.getName()+ " no tiene suficiente vida para utilizar el modo " +
                    "Berserker, vida: "+ this.getHp());

        }


    }

    @Override
    public void Atacar(BaseCharacter b) {
        if (this.getHp() > 0) {

            if(numBerser >0){

                System.out.println("El picaro "+ this.getName()+ " ha realizado 100 de daño a " + b.getName());
                b.Defender(100);
                numBerser-=1;

            }else {
                System.out.println("El picaro "+ this.getName()+ " ha realizado 40 de daño a "+ b.getName());
                b.Defender(this.getDamageCharacter());
            }

        }else {

            System.out.println("El picaro "+ this.getName()+ " no puede atacar, está muerto");

        }
    }

    @Override
    public void Defender(double damage) {

        if((damage < this.getHp()) || (damage-40 < this.getHp() && numBerser >0   )){

            if (this.numBerser >0){

                this.setHp(this.getHp() - (damage-40));

                System.out.println("El picaro "+ this.getName()+ " ha recibido "+ (damage-40)+ " porque está en modo " +
                        "Berserker, dejando de vida: "+ this.getHp());
                numBerser-=1;

            }else {

                this.setHp(this.getHp() - damage);
                System.out.println("El picaro "+ this.getName()+ " ha recibido el daño total de "+ damage+ " dejando " +
                        "su vida en "+ this.getHp() );
            }

        }else {
            System.out.println("El picaro "+ this.getName()+ " está muerto");
        }


    }
}
