package net.imane.pres;

import net.imane.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Imane Mekkaoui
 */
public class PresSpringAnnotation {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("net.imane");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("RES= "+ metier.Calcul());
    }
}
