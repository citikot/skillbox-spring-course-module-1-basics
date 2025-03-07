package online.agatstudio.spring_basics.app_profiles;

import org.springframework.beans.factory.annotation.Value;

public class ProdEnvPrinter implements EnvPrinter {

    @Value("${app.env}")
    private String env;

    @Override
    public void printEnv() {
        System.out.println("Calling ProdEnvPrinter printEnv()!");
        System.out.println("ProdPrinterEnv: " + env);
    }
}
