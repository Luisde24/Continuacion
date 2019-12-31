
package videoJuego.Principal;

public class PortaAviones extends Vehiculos implements Attackable, Shootable {

    public PortaAviones(int nPersonas, int cToneladas, String listaArmamento, int municiones) {
        super(nPersonas, cToneladas, listaArmamento, municiones);

        nPersonas=8000; cToneladas=1500; listaArmamento="Metrañlladora"; municiones=130;
    }

    public void doAttack() {
        System.out.println("El porta aviones esta preparado para salir a Atacar");
    }

    public void doShoot() {
        System.out.println("El porta aviones tiene una Rafaga para disparar");


    }

    @Override
    public String toString() {

        doAttack();
        doShoot();

        return "";

    }
}