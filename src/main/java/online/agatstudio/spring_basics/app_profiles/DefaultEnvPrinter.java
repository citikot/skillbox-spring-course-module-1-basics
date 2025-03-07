package online.agatstudio.spring_basics.app_profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class DefaultEnvPrinter implements EnvPrinter {

    @Value("${spring.profiles.active}")
    private String env;

    @Override
    public void printEnv() {
        System.out.println("Calling DefaultEnvPrinter printEnv()!");
        System.out.println("DefaultPrinterEnv: " + env);
    }
}
