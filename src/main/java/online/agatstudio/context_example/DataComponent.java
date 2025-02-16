package online.agatstudio.context_example;

import org.springframework.stereotype.Component;

@Component
public class DataComponent {

    public DataComponent() {
        System.out.println("DataComponent is initialized.");
    }

    public void someWork() {
        System.out.println("Some component works.");
    }
}
