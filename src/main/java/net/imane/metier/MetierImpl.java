package net.imane.metier;

import net.imane.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Imane Mekkaoui
 */
@Component("metier")
public class MetierImpl implements IMetier {


    private IDao dao; //couplage faible

    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
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
