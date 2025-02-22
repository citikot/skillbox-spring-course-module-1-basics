package online.agatstudio.spring_basics.app_profiles.config;

import online.agatstudio.spring_basics.app_profiles.EnvPrinter;
import online.agatstudio.spring_basics.app_profiles.TestEnvPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("test")
@PropertySource("classpath:application-test.properties")
public class TestAppConfig {

    @Bean
    public EnvPrinter envPrinter() {
        return new TestEnvPrinter();
    }
}
