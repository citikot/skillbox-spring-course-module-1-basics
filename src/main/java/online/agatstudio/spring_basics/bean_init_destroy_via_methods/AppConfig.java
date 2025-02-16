package online.agatstudio.spring_basics.bean_init_destroy_via_methods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfig {

    @Bean(initMethod = "afterInit", destroyMethod = "preDestroy")
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }
}
