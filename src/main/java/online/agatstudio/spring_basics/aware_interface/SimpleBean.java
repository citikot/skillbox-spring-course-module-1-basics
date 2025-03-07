package online.agatstudio.spring_basics.aware_interface;

import org.springframework.beans.factory.BeanNameAware;

public class SimpleBean implements BeanNameAware {

    private String beanName;

    public SimpleBean() {
        System.out.println("SimpleBean created.");
    }

    public void afterInit() {
        System.out.println("PostConstruct called");
    }

    public void preDestroy() {
        System.out.println("PreDestroy called");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void printName() {
        System.out.println("Bean name is: " + beanName);
    }
}
