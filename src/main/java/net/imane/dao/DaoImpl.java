package net.imane.dao;

/**
 * @author Imane Mekkaoui
 */
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double t = 34;
        return t;
    }
}
