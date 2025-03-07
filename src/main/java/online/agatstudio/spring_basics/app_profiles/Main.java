package online.agatstudio.spring_basics.app_profiles;

import online.agatstudio.spring_basics.app_profiles.config.DefaultAppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DefaultAppConfig.class);

        context.getBean(ProfileWorker.class).doWork();
    }
}
