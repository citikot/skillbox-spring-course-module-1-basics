package online.agatstudio.spring_basics.spring_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // choose bean by bean method name
        LogicClass logicClass = context.getBean("logicClassData", LogicClass.class);

        logicClass.simpleLogic();
        logicClass.printLogicData();

        context.getBean(DataComponent.class).someWork();

        context.getBean(Worker.class).call();
    }
}
