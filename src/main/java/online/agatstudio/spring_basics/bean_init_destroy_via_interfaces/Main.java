package online.agatstudio.spring_basics.bean_init_destroy_via_interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleBean simpleBean = context.getBean(SimpleBean.class);

        ((AbstractApplicationContext)context).getBeanFactory().destroyBean("simpleBean", simpleBean);
    }
}
