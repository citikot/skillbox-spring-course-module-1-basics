package online.agatstudio.spring_basics.bean_init_destroy_via_interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SimpleBean implements InitializingBean, DisposableBean {

    public SimpleBean() {
        System.out.println("SimpleBean created.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PreDestroy called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PostConstruct called");
    }
}
