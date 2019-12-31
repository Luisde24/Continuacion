
package videoJuego;

public class Motocicleta extends Vehiculos {

    public Motocicleta(int nPersonas, int cToneladas, String listaArmamento, int municiones) {
        super(nPersonas, cToneladas, listaArmamento, municiones);
        nPersonas=5; cToneladas=1; listaArmamento="Metralladora"; municiones=12;
    }
    public void doAttack() {
        System.out.println("La Motocicleta esta preparada para Atacar");
    }

    public void doShoot() {
        System.out.println("La motocicleta tiene esta lista para disparar la rafaga");
    }

    @Override
    public String toString() {

        doAttack();
        doShoot();

        return "";
    }
}