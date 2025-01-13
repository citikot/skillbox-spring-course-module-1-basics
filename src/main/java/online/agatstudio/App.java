package online.agatstudio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        FirstSingleton singleton1 = context.getBean(FirstSingleton.class);
        FirstSingleton singleton2 = context.getBean(FirstSingleton.class);

        System.out.println(singleton2 == singleton1);

        PrototypeComponent prototypeComponent1 = context.getBean(PrototypeComponent.class);
        PrototypeComponent prototypeComponent2 = context.getBean(PrototypeComponent.class);

        System.out.println(prototypeComponent1 == prototypeComponent2);

        SecondSingleton secondSingleton1 = context.getBean(SecondSingleton.class);
        SecondSingleton secondSingleton2 = context.getBean(SecondSingleton.class);

        System.out.println(secondSingleton1 == secondSingleton2);

        ObjectFactoryHolder factoryHolder = context.getBean(ObjectFactoryHolder.class);

        System.out.println(factoryHolder.getPrototype() == factoryHolder.getPrototype());
        System.out.println(factoryHolder.getSingleton() == factoryHolder.getSingleton());

    }
}
