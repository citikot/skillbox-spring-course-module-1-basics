package online.agatstudio.spring_basics.app_profiles.config;

import online.agatstudio.spring_basics.app_profiles.EnvPrinter;
import online.agatstudio.spring_basics.app_profiles.ProdEnvPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("classpath:application-prod.properties")
public class ProdAppConfig {

    @Bean
    public EnvPrinter envPrinter() {
        return new ProdEnvPrinter();
    }
}
