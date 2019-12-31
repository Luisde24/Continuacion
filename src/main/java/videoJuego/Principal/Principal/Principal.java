
package videoJuego.Principal.Principal;

import videoJuego.Principal.*;

import java.lang.Throwable;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        //NUMERO DE PERSONAS QUE REALIZAN ATAQUES COMBINADOS
        Vehiculos v = new Vehiculos(3,4,"",2);
        System.out.println(v.PersonasEnAtaqueCombinado());

        //cumplimiento de requerimiento 2 que es el numero de toneladas
        System.out.println(v.capacidadTransporte());

        //cumpliemiento de trequerimiento 3
        Jeep j = new Jeep(4,30,"Metralleta", 10);
        j.doShoot();
        Motocicleta m = new Motocicleta(5,1,"Metralleta", 12);
        m.doShoot();
        PortaAviones p = new PortaAviones(8000,1500,"Metralleta", 130);
        p.doShoot();

        //cumplimiento del requerimiento 4
        CamionHI c =new CamionHI(5,38, "Lanza bomba", 12);
        c.doThrow();
        CruceroAlabama cr = new CruceroAlabama(1200,100,"Lanza bomba",30);
        cr.doThrow();

        //cumplimiento del requerimiento 5

        TanqueM4 t = new TanqueM4(10,25,"Lanza Cañon", 15);
        TanqueM4 t1 = new TanqueM4(10,25,"Lanza Cañon", 15);
        TanqueM4 t2 = new TanqueM4(10,25,"Lanza Cañon", 15);
        t.doThrow();
        CamionHI ca =new CamionHI(5,38, "Lanza bomba", 12);
        CamionHI ca1 =new CamionHI(5,38, "Lanza bomba", 12);
        CamionHI ca2 =new CamionHI(5,38, "Lanza bomba", 12);
        CamionHI ca3 =new CamionHI(5,38, "Lanza bomba", 12);
        ca.doDrop();

        //cumplimiento del requisito 6

        //EN CADA UNO DE LOS ARREGLOS VAN AQUELLOS QUE TIENEN UNA FUNCION DE ATACAR, SOLTAR BOMBAS, LANZAR CAÑON Y DISPARAR
        //RAFAGA LAS CUALES NO HICE POR QUE SE ME ACABO EL TIEMPO. Y POR AVERSEME BORRADO LA INFORMACION QUE TENIA.
        //AQUI ES DONDE MAS PUDE HACER PROFESOR.
        ArrayList<Attackable>  combinado = new ArrayList<Attackable>();

        ArrayList<Shootable>  combinado1 = new ArrayList<Shootable>();

        ArrayList<Throwable>  combinado2 = new ArrayList<Throwable>();


        ArrayList<Dropable>  combinado3 = new ArrayList<Dropable>();





    }
}