package net.imane.pres;

import net.imane.dao.DaoImpl;
import net.imane.metier.MetierImpl;
import net.imane.net.imane.ext.DaoImplV2;


/**
 * @author Imane Mekkaoui
 */
public class Pres1 {
    public static void main(String[] args){
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        // metier.setDao(d); // injection de dépendance via le setter
        System.out.println("RES="+metier.Calcul());
    }
}
