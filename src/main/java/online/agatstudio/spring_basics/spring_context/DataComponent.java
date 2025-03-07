package online.agatstudio.spring_basics.spring_context;

import org.springframework.stereotype.Component;

@Component
public class DataComponent {

    public DataComponent() {
        System.out.println("DataComponent init");
    }

    public void someWork() {
        System.out.println("SomeWork in DataComponent");
    }
}
