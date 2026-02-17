package net.imane.ext;

import net.imane.dao.IDao;
import org.springframework.stereotype.Component;

/**
 * @author Imane Mekkaoui
 */
//@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs...");
        double t =12;
        return t;
    }
}
