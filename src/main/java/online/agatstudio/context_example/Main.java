package online.agatstudio.context_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        LogicClass lg = context.getBean("logicClassData", LogicClass.class);
//
//        lg.simpleLogic();
//        lg.printLogicData();
//
//        context.getBean(DataComponent.class).someWork();

        context.getBean(Worker.class).call();
    }
}
