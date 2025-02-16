package online.agatstudio.spring_basics.context_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
// комбинированное создание бинов - при помощи аннотаций и при помощи джавы
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
