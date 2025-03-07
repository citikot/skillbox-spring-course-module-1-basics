package online.agatstudio.spring_basics.post_construct_example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SimpleBean implements BeanNameAware {

    private String beanName;

    public SimpleBean() {
        System.out.println("SimpleBean created.");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("SimpleBean calling afterInit.");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("SimpleBean calling beforeDestroy.");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void printName() {
        System.out.println("Bean name: " + beanName);
    }
}
