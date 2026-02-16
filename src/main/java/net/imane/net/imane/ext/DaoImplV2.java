package net.imane.net.imane.ext;

import net.imane.dao.IDao;

/**
 * @author Imane Mekkaoui
 */
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs...");
        double t =12;
        return t;
    }
}
