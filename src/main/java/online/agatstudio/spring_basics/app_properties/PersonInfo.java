package online.agatstudio.spring_basics.app_properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

// пример передачи свойств через командную строку при запуске джарника
// java -jar <jar.file.name>.jar -Dapp.person.name=Ivan -Dapp.person.surname=Ivanov -Dapp.person.age=3-

@Component
public class PersonInfo {

    @Value("${app.person.name}")
    private String name;
    @Value("${app.person.surname}")
    private String surname;
    @Value("${app.person.age}")
    private int age;

    public void printInfo() {
        System.out.println(MessageFormat.format("Person info: {0}, {1}, {2}", name, surname, age));
    }

}
