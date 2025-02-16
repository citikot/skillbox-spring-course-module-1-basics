package online.agatstudio.spring_basics.scopes_example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Scope("singleton")
public class FirstSingleton {

    private Instant createdTime;

    public FirstSingleton() {
        System.out.println("FirstSingleton created");
        createdTime = Instant.now();
        printCreatedTime();
    }

    private void printCreatedTime() {
        System.out.println("at " + createdTime);
    }

}
