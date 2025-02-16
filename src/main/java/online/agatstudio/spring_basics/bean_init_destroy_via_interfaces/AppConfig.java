package online.agatstudio.spring_basics.bean_init_destroy_via_interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfig {

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }
}
