package online.agatstudio.spring_basics.aware_interface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfig {

    @Bean(initMethod = "afterInit", destroyMethod = "preDestroy")
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }
}
