package pe.com.bbva.reniec.utileria;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyApplicationContextAware implements ApplicationContextAware {
 
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        MyContext.setApplicationContext(ctx);
    }

}
