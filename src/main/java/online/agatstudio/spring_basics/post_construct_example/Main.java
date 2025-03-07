package online.agatstudio.spring_basics.post_construct_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleBean simpleBean = context.getBean(SimpleBean.class);

        ((AbstractApplicationContext)context).getBeanFactory().destroyBean(simpleBean);

        simpleBean.printName();
    }
}
