package online.agatstudio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Scope("prototype")
@Component
public class PrototypeComponent {

    private Instant createdTime;

    public PrototypeComponent() {
        System.out.println("PrototypeComponent created");
        createdTime = Instant.now();
        printCreatedTime();
    }

    public void printCreatedTime() {
        System.out.println("PrototypeComponent created at: " + createdTime);
    }
}
