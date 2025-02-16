package online.agatstudio.spring_basics.bean_lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class SimpleBean {

    public SimpleBean() {
        System.out.println("SimpleBean created.");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("PostConstruct called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy called");
    }
}
