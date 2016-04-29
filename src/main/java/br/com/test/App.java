package br.com.test;

import br.com.test.config.SpringConfig;
import br.com.test.model.Functionality;
import br.com.test.service.FunctionalityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        FunctionalityService functionalityService = context.getBean(FunctionalityService.class);

        Functionality f = new Functionality();
        f.setName("Users");

        functionalityService.save(f);

        f = new Functionality();
        f.setName("Groups");

        functionalityService.save(f);

        List<Functionality> list = functionalityService.list();
        for(Functionality func : list) {
            System.out.println(func.getId() + " - " + func.getName());
        }

    }
}
