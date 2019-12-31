package videoJuego;

public class BombarderosB56 extends Vehiculos  {

    public BombarderosB56(int nPersonas, int cToneladas, String listaArmamento, int municiones) {
        super(nPersonas, cToneladas, listaArmamento, municiones);
        nPersonas = 10;
        cToneladas = 32;
        listaArmamento = "Lanza bombas";
        municiones = 20;
    }
    public void doAttack() {

        System.out.println("El bombardero b56 esta preparado para salir a atacar");
    }

    public void doDrop() {
        System.out.println("El bombardero b56 tiene una lista de equipamiento de bombas ");
    }


    @Override
    public String toString() {

        doAttack();
        doDrop();
        return "";
    }



}