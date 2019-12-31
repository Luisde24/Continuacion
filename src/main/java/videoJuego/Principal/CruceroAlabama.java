package videoJuego;

public class CruceroAlabama extends Vehiculos implements Attackable,Throwable, Dropable {

    public CruceroAlabama(int nPersonas, int cToneladas, String listaArmamento, int municiones) {
        super(nPersonas, cToneladas, listaArmamento, municiones);
        nPersonas = 1200; cToneladas=100; listaArmamento="Lanza bomba"; municiones=30;
    }


    public void doAttack() {
        System.out.println("El Crucero tipo alabama esta preparado para atacar");
    }

    public void doDrop() {
        System.out.println("El crucero tipo alabama tiene unnas bombas preparadas para soltar");
    }
    public void doThrow() {
        System.out.println("El camion de Transporte listo para lanzar bombas");

    }

    @Override
    public String toString() {

        doAttack();
        doDrop();

        return "";
    }
}