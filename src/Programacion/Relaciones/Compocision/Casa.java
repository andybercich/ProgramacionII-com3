package Programacion.Relaciones.Compocision;

public class Casa {

    private int cantPuertas;
    private Puerta [] puertas;

    public Casa(int cantPuertas){

        this.cantPuertas = cantPuertas;
        puertas = new Puerta[cantPuertas];
    }

    public void setCantPuertas(int cantPuertas) {
        int diferencia = this.cantPuertas - cantPuertas;

        if (diferencia <0){
            diferencia*=-1;
        }

        this.cantPuertas = cantPuertas;

        if (this.cantPuertas > puertas.length){

            Puerta[] puertas1 = new Puerta[this.cantPuertas];

            for (int i = 0; i<puertas.length;i++){

                puertas1[i] = puertas[i];

            }

            puertas = puertas1;

            System.out.println("Se pueden agregar "+ diferencia + " puerta/s más a esta casa");

        }else if (this.cantPuertas < puertas.length){

            Puerta [] puertas1 = new Puerta[this.cantPuertas];

            for (int i = 0; i < puertas1.length;i++){

                puertas1[i] = puertas[i];

            }

            puertas = puertas1;
            System.out.println("Se han borrado la/s ultima/s "+ diferencia+ " puerta/s de esta casa");

        }


    }

    public void getPuertas() {
        int i = 1;
        for (Puerta p : puertas){

            System.out.println("Puerta "+i+" :"+ p.getMaterial());
            i++;
        }

    }

    public void agregarPuerta(String material){
        boolean contiene = false;
        Puerta p = new Puerta(material);
        for(int i = 0; i<puertas.length; i++){

            if (puertas[i] == null && !contiene){

                puertas[i] = p;
                contiene =true;

            }

        }
        if (contiene){

            System.out.println("Se ha agregado la puerta");

        }else {
            System.out.println("Esta casa ya tiene el limite de puertas alcanzado, para añadir más setCantPuertas");
        }


    }
}
