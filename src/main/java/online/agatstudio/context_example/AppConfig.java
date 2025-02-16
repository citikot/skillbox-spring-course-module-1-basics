package online.agatstudio.context_example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfig {

    @Bean
    public LogicClass simpleLogicClass() {
        return new LogicClass();
    }

    @Bean
    public LogicClass logicClassData() {
        return new LogicClass("SimpleLogic", 10);
    }
}
