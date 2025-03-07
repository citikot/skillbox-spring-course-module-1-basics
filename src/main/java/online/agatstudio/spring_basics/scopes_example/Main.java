package online.agatstudio.spring_basics.scopes_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        FirstSingleton singleton1 = context.getBean(FirstSingleton.class);
//        FirstSingleton singleton2 = context.getBean(FirstSingleton.class);
//
//        System.out.println(singleton1 == singleton2);
//
//        PrototypeComponent prototypeComponent1 = context.getBean(PrototypeComponent.class);
//        PrototypeComponent prototypeComponent2 = context.getBean(PrototypeComponent.class);
//
//        System.out.println(prototypeComponent1 == prototypeComponent2);
//
//        SecondSinglton secondSinglton1 = context.getBean(SecondSinglton.class);
//        SecondSinglton secondSinglton2 = context.getBean(SecondSinglton.class);
//
//        System.out.println(secondSinglton1 == secondSinglton2);

        ObjectFactoryHolder factoryHolder = context.getBean(ObjectFactoryHolder.class);

        System.out.println(factoryHolder.getPrototype() == factoryHolder.getPrototype());
        System.out.println(factoryHolder.getSinglton() == factoryHolder.getSinglton());

    }
}
