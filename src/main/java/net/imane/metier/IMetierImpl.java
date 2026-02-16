package net.imane.metier;

import net.imane.dao.IDao;

/**
 * @author Imane Mekkaoui
 */

public class IMetierImpl implements IMetier {
    private IDao dao; //couplage faible

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    public IMetierImpl() {
    }

    @Override
    public double Calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI/2 * Math.cos(t);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
