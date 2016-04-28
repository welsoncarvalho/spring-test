package br.com.teste;

import br.com.teste.config.SpringConfig;
import br.com.teste.model.Funcionality;
import br.com.teste.service.FuncionalityService;
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

        FuncionalityService funcionalityService = context.getBean(FuncionalityService.class);

        Funcionality f = new Funcionality();
        f.setName("Users");

        funcionalityService.save(f);

        f = new Funcionality();
        f.setName("Groups");

        funcionalityService.save(f);

        List<Funcionality> list = funcionalityService.list();
        for(Funcionality func : list) {
            System.out.println(func.getId() + " - " + func.getName());
        }

    }
}