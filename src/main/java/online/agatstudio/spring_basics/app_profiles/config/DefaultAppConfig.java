package online.agatstudio.spring_basics.app_profiles.config;

import online.agatstudio.spring_basics.app_profiles.DefaultEnvPrinter;
import online.agatstudio.spring_basics.app_profiles.EnvPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("online.agatstudio.spring_basics.app_profiles")
@PropertySource("classpath:application.properties")
public class DefaultAppConfig {
}
