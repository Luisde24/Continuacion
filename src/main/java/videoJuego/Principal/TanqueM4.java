package videoJuego;

public class TanqueM4 extends Vehiculos  {

    public TanqueM4(int nPersonas, int cToneladas, String listaArmamento, int municiones) {
        super(nPersonas, cToneladas, listaArmamento, municiones);
        nPersonas=10; cToneladas=25; listaArmamento="Lanza Cañon"; municiones=15;
    }

    public void doAttack() {
        System.out.println("El tanque M4 esta preparado es para Atarcar");
    }

    public void doThrow() {
        System.out.println("El tanque M4 esta listo para lanzar Cañon");
    }

    @Override
    public String toString() {
        doAttack();
        doThrow();
        return "";
    }
}