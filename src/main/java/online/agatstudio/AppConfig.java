package online.agatstudio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("online.agatstudio")
public class AppConfig {

    @Bean
    public LogicClass simpleLogicClass() {
        return new LogicClass();
    }

    @Bean
    public LogicClass logicClassData() {
        return new LogicClass("John", 42);
    }

}
