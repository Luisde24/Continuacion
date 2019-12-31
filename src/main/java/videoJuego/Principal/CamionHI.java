
package videoJuego.Principal;

public class CamionHI extends Vehiculos implements Dropable, Throwable  {

    public CamionHI(int nPersonas, int cToneladas, String listaArmamento, int municiones) {
        super(nPersonas, cToneladas, listaArmamento, municiones);
        nPersonas=5; cToneladas =38; listaArmamento =" Lanza Bombas"; municiones=12;

    }



    public void doDrop() {

        System.out.println("El camion de Transporte de suministro tiene unas bombas para soltar");

    }


    public void doThrow() {
        System.out.println("El camion de Transporte listo para lanzar bombas");

    }

    @Override
    public String toString() {
        doDrop();

        doThrow();
        return "";
    }



}