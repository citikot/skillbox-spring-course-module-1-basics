package online.agatstudio.spring_basics.bean_init_destroy_via_methods;

public class SimpleBean {

    public SimpleBean() {
        System.out.println("SimpleBean created.");
    }

    public void afterInit() {
        System.out.println("PostConstruct called");
    }

    public void preDestroy() {
        System.out.println("PreDestroy called");
    }
}
