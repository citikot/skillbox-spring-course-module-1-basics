package online.agatstudio.spring_basics.scopes_example;

import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class SecondSinglton {

    private Instant createdTime;

    private final PrototypeComponent component;

    public SecondSinglton(PrototypeComponent component) {
        System.out.println("SecondSingleton created");
        createdTime = Instant.now();
        printCreatedTime();
        this.component = component;
        component.printCreatedTime();
    }

    private void printCreatedTime() {
        System.out.println("at " + createdTime);
    }
}
