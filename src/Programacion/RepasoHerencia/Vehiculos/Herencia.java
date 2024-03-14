package Programacion.RepasoHerencia.Vehiculos;



public class Herencia {

    public static void main (String [] args){
        Auto a1 = new Auto("Amarillo", 4,1.0,75);
        Auto a = new Auto("Rosado", 4,6.0,250);
        Camion c = new Camion("Rojo", 8,3.2, 80,1500 );
        Bici b = new Bici("Azul", true);
        Moto m = new Moto("Verde", false , 0.900, 220);

        Vehiculo[] vA = new Vehiculo[5];
        vA [0] = a1; vA [1] = a; vA[2] = c; vA[3] = b ; vA [4] = m;

        Catalogar(vA);
        System.out.println(CatalogarMod(vA,2));



    }

    public static void Catalogar (Vehiculo [] v){

        for (Vehiculo n : v){

            System.out.println(n.getClass() + "  "+n.Datos());

        }


    }





    public static String  CatalogarMod (Vehiculo [] v, int rue){
        int cant = 0;
        for (Vehiculo n : v){

            if (n.getRuedas() == rue){

                cant+=1;

            }

        }

        return "Se han encontrado "+ cant+ " vehiculos con "+ rue + " ruedas";


    }

}







