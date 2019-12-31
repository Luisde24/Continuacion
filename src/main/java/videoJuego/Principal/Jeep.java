
package videoJuego;

public class Jeep extends Vehiculos  {

    public Jeep(int nPersonas, int cToneladas, String  listaArmamento, int municiones) {
        super(nPersonas, cToneladas, listaArmamento, municiones);
        nPersonas=4; cToneladas=30; listaArmamento = "Metrajeta"; municiones=10;
    }
    public void doAttack() {
        System.out.println("El jeep de reconocimiento esta preparado para salir a atacar");
    }

    public void doShoot() {

        System.out.println("El jeep de reconocimiento tiene una rafaga preparada patra la guerra");
    }

    @Override
    public String toString() {

        doAttack();
        doShoot();
        return "";
    }
}


