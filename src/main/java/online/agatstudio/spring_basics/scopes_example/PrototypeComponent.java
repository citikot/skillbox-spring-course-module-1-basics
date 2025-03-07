package online.agatstudio.spring_basics.scopes_example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Scope("prototype")
public class PrototypeComponent {

    private Instant createdTime;

    public PrototypeComponent() {
        System.out.println("PrototypeComponent created");
        createdTime = Instant.now();
        printCreatedTime();
    }

    void printCreatedTime() {
        System.out.println("at " + createdTime);
    }
}
