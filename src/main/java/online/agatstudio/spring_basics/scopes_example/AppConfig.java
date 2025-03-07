package online.agatstudio.spring_basics.scopes_example;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
// создание бинов только при помощи аннотаций, этот класс нужен для указания, откуда сканировать спрингу в поисках компонентов
public class AppConfig {
}
