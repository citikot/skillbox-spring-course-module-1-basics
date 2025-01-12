package online.agatstudio;

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
